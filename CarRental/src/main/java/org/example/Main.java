package org.example;

import org.example.Product.Status;
import org.example.Product.Vehicle;
import org.example.Product.VehicleType;

import java.time.Instant;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        VehicleRentalSystem vsr = new VehicleRentalSystem();
        Location location1 = new Location();
        location1.setAddress("B-1/14");
        location1.setCity("New Delhi");
        location1.setState("Delhi");
        location1.setPincode(110078);

        Location location2 = new Location();
        location2.setAddress("B-1/15");
        location2.setCity("New Delhi");
        location2.setState("Delhi");
        location2.setPincode(110079);

        Store store1 = Store.addStore(location1,1);
        Store store2 = Store.addStore(location2,2);
        Store store3 = Store.addStore(location1,3);

        vsr.addStore(store1);
        vsr.addStore(store2);
        vsr.addStore(store3);

        User user1 = User.addUser("123456",1);
        User user2 = User.addUser("989123",2);

        vsr.addUser(user1);
        vsr.addUser(user2);

        Vehicle v1 = new Vehicle();
        v1.setVehicleNumber("1234");
        v1.setKmTraveled(123);
        v1.setStatus(Status.IDLE);
        v1.setVehicleType(VehicleType.CAR);

        Vehicle v2 = new Vehicle();
        v2.setVehicleNumber("ABC");
        v2.setKmTraveled(12);
        v2.setStatus(Status.IDLE);
        v2.setVehicleType(VehicleType.CAR);

        VehicleInventory vehicleInventory = store1.getVehicleInventory();
        vehicleInventory.addVehicle(v1);
        vehicleInventory.addVehicle(v2);


        // search all store
        List<Store> allStores = vsr.getStore(location1);
        System.out.println("All Store id");
        allStores.forEach(e->System.out.println(e.getStoreId()));
        // choose a vehicle
        List<Vehicle> allVehicle = allStores.get(0).getAllVehicle();
        System.out.println("All Vehicles at "+allStores.get(0).getStoreId());
        allVehicle.forEach(e->System.out.println(e.getVehicleNumber()));
        Vehicle choosenVehicle = allVehicle.get(0);

        // Reserve the Vehicle
        Reservation reservation = store1.createReserVation(choosenVehicle, Instant.now(),Instant.now().plusSeconds(4320000),location1,location2,user1);
        System.out.println("Reservation done for chosen vehicle "+choosenVehicle.getVehicleNumber());
        // Genrate the Bill
        Bill bill  = new Bill(reservation);

        // Pay the bill
        Payment payment = new Payment(bill);
        payment.payBill();



    }
}