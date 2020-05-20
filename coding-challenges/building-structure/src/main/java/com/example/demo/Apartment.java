package com.example.demo;

import java.util.ArrayList;

public abstract class Apartment {
    int apartmentsurfacearea = -1; // given in m²
    int apartmentnumber = -1;
    String apartmentlocation = new String();
//    Resident resident = new Resident(); // given for 1 or more ? check the count...

//    int floornumber = -1;
    ArrayList<Resident> apartmentResidents = new ArrayList<Resident>();
    ArrayList<Balcony> apartmentBalconys = new ArrayList<Balcony>();

    public abstract int getFloornumber();

    public ArrayList<Balcony> getApartmentBalconys() {
        return apartmentBalconys;
    }

    public void setApartmentBalconys(ArrayList<Balcony> apartmentBalconys) {
        this.apartmentBalconys = apartmentBalconys;
    }

    public void addResident(Resident newResident)
    {
        apartmentResidents.add(newResident);
    }

    public void addBalcony(Balcony newBalcony)
    {
        apartmentBalconys.add(newBalcony);
    }

    public void setApartmentlocation(String apartmentlocation) {
        this.apartmentlocation = apartmentlocation;
    }

    public void setApartmentnumber(int apartmentnumber) {
        this.apartmentnumber = apartmentnumber;
    }

    public void setApartmentResidents(ArrayList<Resident> apartmentResidents) {
        this.apartmentResidents = apartmentResidents;
    }

    public void setApartmentsurfacearea(int apartmentsurfacearea) {
        this.apartmentsurfacearea = apartmentsurfacearea;
    }

    public int getApartmentnumber() {
        return apartmentnumber;
    }

    public int getApartmentsurfacearea() {
        return apartmentsurfacearea;
    }

    public String getApartmentlocation() {
        return apartmentlocation;
    }

    public ArrayList<Resident> getApartmentResidents() {
        return apartmentResidents;
    }

    //    List<Class<? extends ResidentCar>> cars = new ArrayList<Class<? extends A>>();
//    cars.add(B.class);
//    cars.add(C.class);

//    List<Class<? extends ApartmentParkingspaces>> parkspaces = new ArrayList<Class<? extends A>>();
//    parkspaces.add(A.class);


}
