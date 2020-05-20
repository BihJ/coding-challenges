package com.example.demo;


// UpperFloorApartment and Attic can be extending the same class
//
public class UpperFloorApartment extends Apartment {
    boolean hasbalcony = false;
    int balconyarea = -1;
    int floornumber = -1;


    public void setFloornumber(int floornumber) {
        this.floornumber = floornumber;
    }

    public int getFloornumber() {
        return floornumber;
    }
}
