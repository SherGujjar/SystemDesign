package org.example;

import org.example.Product.Vehicle;

import java.time.Instant;
import java.util.ArrayList;

import java.util.List;

public class Store {

    private int storeId;

    private VehicleInventory vehicleInventory;

    private Location location;

    List<Reservation> reservationList = new ArrayList<>();

    public VehicleInventory getVehicleInventory() {
        return vehicleInventory;
    }

    public void setVehicleInventory(VehicleInventory vehicleInventory) {
        this.vehicleInventory = vehicleInventory;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public List<Reservation> getReservationList() {
        return reservationList;
    }

    public void setReservationList(List<Reservation> reservationList) {
        this.reservationList = reservationList;
    }

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public static Store addStore( Location location,int id){
        Store store = new Store();
        store.setLocation(location);
        store.setStoreId(id);
        store.setVehicleInventory(new VehicleInventory());
        store.setReservationList(new ArrayList<>());
        return store;
    }

    public Reservation createReserVation(Vehicle vehicle, Instant bookedFrom, Instant bookedTill, Location pickup , Location dropOff, User user){
        Reservation reservation = new Reservation();
        reservation.setVehicle(vehicle);
        reservation.setUser(user);
        reservation.setBookedFrom(bookedFrom);
        reservation.setBookedTill(bookedTill);
        reservation.setPickup(pickup);
        reservation.setDropOff(dropOff);
        reservationList.add(reservation);
        return reservation;
    }

    public List<Vehicle> getAllVehicle(){
        return this.vehicleInventory.getAllVehicle();
    }

    public Bill generateBill(Reservation reservation){
        return new Bill(reservation);
    }


}
