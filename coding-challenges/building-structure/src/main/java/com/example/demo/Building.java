package com.example.demo;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class Building {

    String street = new String();
    int housenumber = -1;
    int postalcode = -1;
    String city = new String();

    ArrayList<Apartment> buildingApartments = new ArrayList<Apartment>();
    ArrayList<ApartmentParkingspaces> buildingParkingspaces = new ArrayList<ApartmentParkingspaces>();

    public void setStreet(String street) {
        this.street = street;
    }

    public void setBuildingApartments(ArrayList<Apartment> buildingApartments) {
        this.buildingApartments = buildingApartments;
    }

    public ArrayList<ApartmentParkingspaces> getBuildingParkingspaces() {
        return buildingParkingspaces;
    }

    public void setBuildingParkingspaces(ArrayList<ApartmentParkingspaces> buildingParkingspaces) {
        this.buildingParkingspaces = buildingParkingspaces;
    }

    public String getStreet() {
        return street;
    }

    public int getHousenumber() {
        return housenumber;
    }

    public int getPostalcode() {
        return postalcode;
    }

    public String getCity() {
        return city;
    }

    public ArrayList<Apartment> getBuildingApartments() {
        return buildingApartments;
    }

    public void setHousenumber(int housenumber) {
        this.housenumber = housenumber;
    }

    public void setPostalcode(int postalcode) {
        this.postalcode = postalcode;
    }

    public void setCity(String city) {
        this.city = city;
    }


    public void addBuildingApartments(Apartment newApartment) {
//        this.buildingApartments = buildingApartments; // for setter method...
        buildingApartments.add(newApartment);
    }

    public void addApartmentParkingspaces(ApartmentParkingspaces newParkingspace) {
//        this.buildingApartments = buildingApartments; // for setter method...
        buildingParkingspaces.add(newParkingspace);
    }


    /*
    public String setadress(String streetinput, int housenumber, int postalcode, String city)
    {
        streetinput = streetinput;
    }
*/

}

/*
In this task, a data structure for a building is to be created.
The building has an address consisting of the street, house number, postal code, and city.
A building contains residential units of the type ground floor apartment, upper floor apartment, or attic apartment.
All apartment types have a surface area. Area specifications are given in square meters.
Each apartment can have one or more residents. A resident has a full name. Residents own cars.
A car has a color and a manufacturer (e.g. Audi, BMW, ...) Each apartment has a number.
Each apartment has a location: left, center, or right.
Ground floor apartments may have a garden.
The upper floor and attic apartments may have a balcony.
A balcony has a surface area. The upper floor and attic apartments have a floor number.

A building includes parking spaces.
A parking space can be assigned to one apartment (maximum).
An apartment can have several parking spaces.
*/
