package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
//        BuildingStructure example = new BuildingStructure();
//        System.out.println(example.streetinput);

        UpperFloorApartment x = new UpperFloorApartment();
        GroundFloorApartment y = new GroundFloorApartment();

        SpringApplication.run(Main.class, args);
        System.out.println("hello world");
        System.out.println(x.floornumber);
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


