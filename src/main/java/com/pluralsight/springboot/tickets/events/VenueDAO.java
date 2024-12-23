package com.pluralsight.springboot.tickets.events;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "venue")
public class VenueDAO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String name;

    @Column
    private String street;

    @Column
    private String city;

    @Column
    private String country;
}
