package com.pluralsight.springboot.tickets.events;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductDAORepository extends CrudRepository<ProductDAO, Integer> {
    List<ProductDAO> findByEventId(int eventId);
}


