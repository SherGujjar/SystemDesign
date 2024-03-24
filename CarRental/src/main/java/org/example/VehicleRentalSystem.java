package org.example;

import org.example.Store;
import org.example.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class VehicleRentalSystem {
    List<User> userList = new ArrayList<>();

    List<Store> storeList = new ArrayList<>();


    public void addUser(User user){
        userList.add(user);
    }
    public void addStore(Store store){
        storeList.add(store);
    }

    public List<Store> getStore(Location location){
        return storeList.stream().filter(e->e.getLocation().getCity().equalsIgnoreCase(location.getCity())).collect(Collectors.toList());
    }

}
