package Bike;

public class Bike {
    private int numberOfWheels;
    private String manufacturer;
    private int year;
    private double mileage;

    public Bike(){
        this.numberOfWheels = 2;
        this.manufacturer = "Schwinn";
        this.year = 2014;
        this.mileage = 2.5;
    }

    public Bike(int numberOfWheels, String manufacturer, int year, double mileage) {
        this.numberOfWheels = numberOfWheels;
        this.manufacturer = manufacturer;
        this.year = year;
        this.mileage = mileage;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Number of Wheels: " + numberOfWheels +"\nManufacturer: " + manufacturer +
                "\nYear: " + year + "\nMileage: " + mileage + " miles";
    }
}
