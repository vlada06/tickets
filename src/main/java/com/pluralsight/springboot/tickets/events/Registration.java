package com.pluralsight.springboot.tickets.events;

public record Registration(Integer id, Integer productOId, String ticketCode, String attendeeName) {
}
