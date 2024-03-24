package org.example;

public class User {
    private int userId;

    private String drivingLicense;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getDrivingLicense() {
        return drivingLicense;
    }

    public void setDrivingLicense(String drivingLicense) {
        this.drivingLicense = drivingLicense;
    }

    public static User addUser(String license,int id){
        User usr = new User();
        usr.setDrivingLicense(license);
        usr.setUserId(id);
        return usr;
    }


}
