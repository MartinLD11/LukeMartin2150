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
