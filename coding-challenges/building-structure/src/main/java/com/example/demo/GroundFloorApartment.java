package com.example.demo;

public class GroundFloorApartment extends Apartment {
    boolean hasgarden = false;

    public void setHasgarden(boolean hasgarden) {
        this.hasgarden = hasgarden;
    }

    public boolean isHasgarden() {
        return hasgarden;
    }

    @Override
    public int getFloornumber(){
        return 0;
    }
}
