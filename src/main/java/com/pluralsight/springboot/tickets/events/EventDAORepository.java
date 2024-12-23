package com.pluralsight.springboot.tickets.events;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EventDAORepository extends JpaRepository<EventDAO, Integer> {

     List<EventDAO> findByOrganizerId(int organizerId);

}
