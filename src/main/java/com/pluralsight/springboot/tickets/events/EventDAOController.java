package com.pluralsight.springboot.tickets.events;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
public class EventDAOController {

    private final OrganizerDAORepository organizerRepository;
    private final EventDAORepository eventRepository;
    private final ProductDAORepository productRepository;

    public EventDAOController(OrganizerDAORepository organizerRepository,
                           EventDAORepository eventRepository,
                           ProductDAORepository productRepository) {
        this.organizerRepository = organizerRepository;
        this.eventRepository = eventRepository;
        this.productRepository = productRepository;
    }

    @GetMapping(path = "/organizersnew")
    public List<OrganizerDAO> getOrganizers() {
        return organizerRepository.findAll();
    }

    @GetMapping(path = "/eventsnew")
    public List<EventDAO> getEventsByOrganizer(@RequestParam("organizerId") int organizerId) {
        return eventRepository.findByOrganizerId(organizerId);
    }

    @GetMapping(path = "/eventsnew/{id}")
    public EventDAO getEventById(@PathVariable("id") int eventId) {
        return eventRepository.findById(eventId)
                .orElseThrow(() -> new NoSuchElementException("Event with id " + eventId + " not found"));
    }

    @GetMapping(path = "/productsnew")
    public List<ProductDAO> getProductsByEvent(@RequestParam("eventId") int eventId) {
        return productRepository.findByEventId(eventId);
    }
}
