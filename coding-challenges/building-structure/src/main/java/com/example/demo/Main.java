package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
//        BuildingStructure example = new BuildingStructure();
//        System.out.println(example.streetinput);

        SpringApplication.run(Main.class, args);
        // Creating an example building
        Building building = new Building();
        building.setCity("Whv");
        building.setHousenumber(36);
        building.setPostalcode(26382);
        building.setStreet("Werftstraße");

        // Creating an example apartment with two residents
        // Creating apartments
            // Create first
        UpperFloorApartment upperapartment0 = new UpperFloorApartment();
        upperapartment0.setApartmentnumber(2);
        upperapartment0.setApartmentsurfacearea(65);
        upperapartment0.setApartmentlocation("right");
        upperapartment0.setFloornumber(3);


            // Creating second
        GroundFloorApartment groundapartment0 = new GroundFloorApartment();
        groundapartment0.setApartmentnumber(0);
        groundapartment0.setApartmentsurfacearea(44);
        groundapartment0.setApartmentlocation("left");
        groundapartment0.setHasgarden(true);

            // Creating third
        UpperFloorApartment atticapartment = new UpperFloorApartment();
        atticapartment.setApartmentnumber(10);
        atticapartment.setFloornumber(5);
        atticapartment.setApartmentsurfacearea(130);
        atticapartment.setApartmentlocation("left");


        // Creating fourth
        GroundFloorApartment groundapartment1 = new GroundFloorApartment();
        groundapartment1.setApartmentnumber(1);
        groundapartment1.setApartmentsurfacearea(60);
        groundapartment1.setApartmentlocation("right");
        groundapartment1.setHasgarden(true);

        // Creating residents
        Resident resident0 = new Resident();
        resident0.setResidentfullname("Julius Bihler");
        ResidentCar rescarseat = new ResidentCar();
        rescarseat.setColorstring("blue");
        rescarseat.setManufacturer("Seat");
        resident0.addResidentCar(rescarseat);

        Resident resident1 = new Resident();
        resident1.setResidentfullname("Mr X");
        resident1.addResidentCar(rescarseat);

        Resident residentrich = new Resident();
        residentrich.setResidentfullname("Mr Rich");

        // Adding residents to apartments
        upperapartment0.addResident(resident0);
        upperapartment0.addResident(resident1);
        upperapartment0.apartmentResidents.get(1).setResidentfullname("Mr X");
        upperapartment0.apartmentResidents.forEach(resident -> System.out.println(resident.getResidentfullname()));

        atticapartment.addResident(residentrich);

        groundapartment0.addResident(residentrich);

        groundapartment1.addResident(resident0);

        // Pring example floornumber
        System.out.println(upperapartment0.getFloornumber());

        // Creating parking spaces
        ApartmentParkingspaces parkingspace0 = new ApartmentParkingspaces();
        parkingspace0.setAssignedApartment(atticapartment);
        ApartmentParkingspaces parkingspace1 = new ApartmentParkingspaces();
        parkingspace1.setAssignedApartment(groundapartment0);

        // assign parking space
        building.addApartmentParkingspaces(parkingspace0);

        // adding Balconys
        Balcony balcony0 = new Balcony();
        balcony0.setSurfacearea(10);
        upperapartment0.addBalcony(balcony0);

        // Adding apartment to Building
        building.addBuildingApartments(upperapartment0);
        building.addBuildingApartments(groundapartment0);
        building.addBuildingApartments(groundapartment1);
        building.addBuildingApartments(atticapartment);


        // calling the print functions
        Utilities utilities = new Utilities();
        utilities.printBuilding(building);
        utilities.printSurfaceArea(building);
        utilities.printResidents(building);

    }



}
/*

Task 2: Instances

        Instantiate a building that has different properties (apartments, residents, and so on). Create several apartments in that building. You are free to choose the exact properties, but you should ensure diversity. In particular, make sure that the following constraints are fulfilled:

        The building has at least three apartments
        there are residents who have rented several apartments
        some residents own cars
        some apartments have parking spaces assigned
        Task 3: Print

        Write a function that accepts a building and outputs it to the console. Make sure to output all (sub-)properties and classes and their values. Ensure that the data is displayed clearly arranged.

        Task 3b: Calculate & Print Area

        Write a function that calculates the overall surface area of the building. Balcony areas are included in the calculation with the factor 0.5. Attic apartments are included in the calculation with a factor of 0.75. Display the result in the console.
*/


