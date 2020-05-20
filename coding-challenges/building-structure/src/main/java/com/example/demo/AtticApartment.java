package com.example.demo;

public class AtticApartment extends Apartment {
    boolean hasbalcony = false;
    int balconyarea = -1;
    int floornumber = -1;

    public int getFloornumber() {
        return floornumber;
    }

    public void setFloornumber(int floornumber) {
        this.floornumber = floornumber;
    }
}
