package org.example;

import org.example.Product.Vehicle;

import java.time.Instant;
import java.util.Date;

public class Reservation {
    private int reserveId;
    private User user;

    private Vehicle vehicle;

    private Instant bookingDate;

    private Instant bookedFrom;

    private Instant bookedTill;

    private Location pickup;
    private Location dropOff;

    public int getReserveId() {
        return reserveId;
    }

    public void setReserveId(int reserveId) {
        this.reserveId = reserveId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Instant getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Instant bookingDate) {
        this.bookingDate = bookingDate;
    }

    public Instant getBookedFrom() {
        return bookedFrom;
    }

    public void setBookedFrom(Instant bookedFrom) {
        this.bookedFrom = bookedFrom;
    }

    public Instant getBookedTill() {
        return bookedTill;
    }

    public void setBookedTill(Instant bookedTill) {
        this.bookedTill = bookedTill;
    }

    public Location getPickup() {
        return pickup;
    }

    public void setPickup(Location pickup) {
        this.pickup = pickup;
    }

    public Location getDropOff() {
        return dropOff;
    }

    public void setDropOff(Location dropOff) {
        this.dropOff = dropOff;
    }
}
