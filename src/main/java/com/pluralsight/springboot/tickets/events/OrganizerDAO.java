package com.pluralsight.springboot.tickets.events;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * Data entity for JPA
 *
 */
@Getter
@Setter
@Entity
@Table(name = "organizers")
public class OrganizerDAO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String name;

    @Column
    private String description;

}
