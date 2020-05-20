package com.example.demo;

import java.util.ArrayList;

public class Resident{
    String residentfullname = new String();

    ArrayList<ResidentCar> resitentCars = new ArrayList<ResidentCar>();

    public void setResidentfullname(String residentfullname) {
        this.residentfullname = residentfullname;
    }
    // car objects for every


    public String getResidentfullname() {
        return residentfullname;
    }

    public void addResidentCar(ResidentCar car) {
        resitentCars.add(car);
    }

    public ArrayList<ResidentCar> getResitentCars() {
        return resitentCars;
    }

    public void setResitentCars(ArrayList<ResidentCar> resitentCars) {
        this.resitentCars = resitentCars;
    }
}
