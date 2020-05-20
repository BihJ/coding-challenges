package com.example.demo;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Utilities {

    public void printBuilding(Building printbuilding) {
        System.out.printf("Adress:\t%s %d, %d, %s%n", printbuilding.getStreet(), printbuilding.getHousenumber(), printbuilding.getPostalcode(),
                printbuilding.getCity());
/*

        printbuilding.buildingApartments.forEach(apartment ->
                System.out.printf("Apartment Number: %s in Building (address): %s %d%n", apartment.getApartmentnumber(), printbuilding.getStreet(), printbuilding.getHousenumber()));
*/
        int apartmentareasum = 0;
        printbuilding.buildingApartments.forEach(apartment -> {
            System.out.printf("Apartment number: %d%n", apartment.getApartmentnumber());
            System.out.printf("Apartment location: %s%n", apartment.getApartmentlocation());
            System.out.printf("Apartment surfacearea: %d%n", apartment.getApartmentsurfacearea());
            try {
/*
                if (apartment != GroundFloorApartment.class && GroundFloorApartment.class.isAssignableFrom(apartment)) {

                }*/
//                System.out.printf("Apartment Number: %s%n", apartment.getFloornumber());

            }
            catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("Residents:");
            apartment.getApartmentResidents().forEach(resident -> {
                System.out.println(String.format("\tResident name: %s", resident.getResidentfullname()));
                resident.getResitentCars().forEach(residentCar -> System.out.println(String.format("\t\tCar: %s", residentCar.getManufacturer())));
            });
            System.out.println();
        });
        System.out.println("Following apartments have parking spaces:");
        printbuilding.getBuildingParkingspaces().forEach(apartmentParkingspace ->
                System.out.println(String.format("Apartment %d", apartmentParkingspace.getAssignedApartment().getApartmentnumber()))
                );


//        printbuilding.buildingApartments.stream().reduce(0, (a,b) -> a + b);

//        apartmentareasum += apartment.getApartmentsurfacearea();


    }
    public int sumArea(int x, int y){
        return x + y;
    }

    public void printSurfaceArea(Building building){
        int sumArea = 0;
        double atticfactor = 0.75;
        double balconyfactor = 0.5;
//        public abstract GroundFloorApartment
        for (Apartment i : building.getBuildingApartments()){
            if (i instanceof AtticApartment){
                sumArea += i.getApartmentsurfacearea() * atticfactor;
            } else {
                sumArea += i.getApartmentsurfacearea();
            }

            for (Balcony j : i.getApartmentBalconys())
                sumArea += j.getSurfacearea() * balconyfactor;
        }
        System.out.println(String.format("Overall surface area: %d", sumArea));
//        building.buildingApartments.stream(apartment -> sumArea.add(apartment.getApartmentsurfacearea()));

    }

    public void printResidents(Building building){
//        public abstract GroundFloorApartment
        ArrayList<Resident> residentArrayList = new ArrayList<Resident>();
        ArrayList<Apartment> apartmentArrayList = new ArrayList<Apartment>();
        building.getBuildingApartments().forEach(apartment -> apartment.getApartmentResidents().forEach(resident -> {
                    residentArrayList.add(resident);
                    apartmentArrayList.add(apartment);
                }
            ));

//        building.getBuildingApartments().forEach(apartment -> apartment.getApartmentResidents().forEach(resident -> residentArrayList.add(resident)));

        // This is a hash set.. but it turns the classes into strings?
        // btw. accessing the memory by a hash code is not working tbh...
        // hashset of residents was the solution
        // compare the classes by its hash...
        HashSet<Resident> residenthashSet = new HashSet(residentArrayList);
        residenthashSet.forEach(resident -> {

            System.out.println(String.format("Apartments for Resident: %s",
//                    residentArrayList.get(residentindex).getResidentfullname(),
                    resident.getResidentfullname()
            ));
            int residentindex = residentArrayList.indexOf(resident);
            while (residentindex != -1) { // while loop is uncool cause the danger for beeing stucked in a large loop should be avoided

                System.out.println(String.format("Apartmentnumber: %d,\tApartmentlocation: %s,\tFloornumber: %d",
                        apartmentArrayList.get(residentindex).getApartmentnumber(),
                        apartmentArrayList.get(residentindex).getApartmentlocation(),
                        apartmentArrayList.get(residentindex).getFloornumber()
                ));


                residentArrayList.remove(residentindex);
                apartmentArrayList.remove(residentindex);
                residentindex = residentArrayList.indexOf(resident);

            }});
        // sets... are a better sollution
//        residenthashSet.forEach(residenthash -> System.out.println(residentArrayList.get(residentArrayList.indexOf(residenthash)).getResidentfullname()));
//        Set<Resident> uniqueResidents = residentArrayList.contains();
//        System.out.println("Unique residents: " + uniqueResidents);



    }
/*

        for (Apartment i : building.getBuildingApartments()){
            if (i instanceof AtticApartment){
                sumArea += i.getApartmentsurfacearea() * atticfactor;
            } else {
                sumArea += i.getApartmentsurfacearea();
            }

            for (Balcony j : i.getApartmentBalconys())
                sumArea += j.getSurfacearea() * balconyfactor;
        }
        System.out.println(String.format("Overall surface area: %d", sumArea));
        building.buildingApartments.stream(apartment -> sumArea.add(apartment.getApartmentsurfacearea()));
*/

}
