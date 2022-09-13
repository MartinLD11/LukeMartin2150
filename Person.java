/**
 * Name: Luke Martin
 * Class: Itec 2150
 * description: Person should have the following properties (attributes, instance variables, member variables). Pick appropriate data types:
 * name – stores the full name of a person
 * age – stores age of a person in whole years
 * eyeColor – stores the color of a person’s eyes
 * Create a no-argument constructor for this class
 * In the constructor for the Person class, use your information to initialize the instance variables
 * Create a 3-arg constructor that initializes the instance variables to passed parameters
 * Create getters/accessors for each instance variable
 * Create setters/mutators for each instance variable
 * Override the toString() method to return a clear message providing details of each person.
 * Create instance method talk() that prints a message “Welcome, coders! I am ”, underline should be replaced by the person’s name. It does not need any parameters and does not return any values.
 * Grade:
 */

package Person;

public class Person {
    private String name;
    private int age;
    private String color;

    public Person(String name, int age, String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }
    public Person(){
        this("Luke", 22, "Brown");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void talk(){
        System.out.println("Welcome coders, my name is " + name);
        System.out.println("I am " + age + " years old and I have " + color + " eyes.");
    }

    @Override
    public String toString() {
        return "Name: " + name + "Age: " + age + "Eye Color: " + color;
    }
}
