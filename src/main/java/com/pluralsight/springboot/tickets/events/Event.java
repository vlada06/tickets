package com.pluralsight.springboot.tickets.events;

import java.time.LocalDate;
import java.util.Date;

public record Event(int id,
                    String name,
                    Organizer organizer,
                    Venue venue,
                    LocalDate startDate,
                    LocalDate endDate) {
}
