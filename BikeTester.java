/**
Name: Luke Martin
Class: Itec 2150
Description: Bike Class
Create a business class called Bike
Bikes should at least have number of wheels, manufacturer and year data. Additional data can be created at the programmer’s discretion.
A no-arg constructor with values of 2 for number of wheels to 2, “Schwinn” for manufacturer, and 2014 for year should eb created.
Other constructors, getters, setters and toString() method should be created.
BikeTester Class
Use the BikeTester class to create object bike1 using no-arg constructor. Print its details after creation.
Create object bike2 in the same manner, and use the setter methods to change the instance variable values to those of your choice.
Print details of bike2.
Create an arraylist of bikes called bikeList.
Add bike1 and bike2 to this list
SOP bikeList
Count the total number of wheels on all bikes in the bikeList and print them
Find the year of the oldest bike in the list and print that year.
Grade: 
*/

package Bike;
import java.util.ArrayList;

public class BikeTester {
    public static void main(String[] args) {
        Bike bike1 = new Bike();
        System.out.println("Bike 1 \n" + bike1.toString());

        Bike bike2 = new Bike();
        bike2.setNumberOfWheels(4);
        bike2.setManufacturer("Trek");
        bike2.setYear(2010);
        bike2.setMileage(15.4);
        System.out.println("\nBike 2 \n" + bike2.toString());

        ArrayList<Bike> bikeList = new ArrayList<>();
        bikeList.add(bike1);
        bikeList.add(bike2);
        System.out.println("\nBike List: \n" + bikeList);

        int totalWheels = 0;
        for(int wheel = 0; wheel < bikeList.size(); wheel++){
            totalWheels += bikeList.get(wheel).getNumberOfWheels();
        }
        System.out.println("\nTotal number of wheels on all bikes is: " + totalWheels);

        int oldYear = 0;
        for(int old = 0; old < bikeList.size(); old++){
            if(bikeList.get(old).getYear() < bikeList.get(oldYear).getYear()){
                oldYear = old;
            }
        }
        System.out.println("\nThe year of the oldest bike is: " + bikeList.get(oldYear).getYear());
    }
}
