# Building structure

The following tasks are about representing the properties of a building in a data structure.
The challenge should be completed with Java.

## Tasks

**Task 1: Creating A Data Structure**

In this task, a data structure for a building is to be created. The building has an address consisting of the street, house number, postal code, and city. A building contains residential units of the type ground floor apartment, upper floor apartment, or attic apartment. All apartment types have a surface area. Area specifications are given in square meters. Each apartment can have one or more residents. A resident has a full name. Residents own cars. A car has a color and a manufacturer (e.g. Audi, BMW, ...)
Each apartment has a number. Each apartment has a location: left, center, or right. 
Ground floor apartments may have a garden.
The upper floor and attic apartments may have a balcony. A balcony has a surface area.
The upper floor and attic apartments have a floor number.

A building includes parking spaces. A parking space can be assigned to one apartment (maximum).  An apartment can have several parking spaces. 

**Task 2: Instances**

Instantiate a building that has different properties (apartments, residents, and so on). Create several apartments in that building. You are free to choose the exact properties, but you should ensure diversity.
In particular, make sure that the following constraints are fulfilled:
1. The building has at least three apartments 
2. there are residents who have rented several apartments
3. some residents own cars
4. some apartments have parking spaces assigned

**Task 3: Print**

Write a function that accepts a building and outputs it to the console. Make sure to output all (sub-)properties and classes and their values. Ensure that the data is displayed clearly arranged.

**Task 3b: Calculate & Print Area**

Write a function that calculates the overall surface area of the building. 
Balcony areas are included in the calculation with the factor 0.5.
Attic apartments are included in the calculation with a factor of 0.75.
Display the result in the console.

**Task 4: Projection**

Write a function that lists all known residents (Full Name) of the building in the console. The apartment (number, location, and if applicable, floor) should be output for each resident.
If a resident has rented several apartments, he or she should only be listed once, but then with several apartment information.

**Task 5: Additional Data - Rooms**

Add the possibility to specify rooms to the apartments. A room has a name.

As a special feature, a room should be able to be divided into several rooms. In other words, a room can itself consist of several rooms (and so on!). 

Extend your instances with information about rooms. It is sufficient to add room information to a single apartment. Create at least one room that is itself divided into rooms. 

Modify your console output from Task 3 to include room information.

## Hints

If you have any questions feel free to contact Florian Klein.
