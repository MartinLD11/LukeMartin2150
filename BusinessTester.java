/**
Name: Luke Martin
Class: Itec 2150
Description: Create a business class to model a textbook. Decide what data should be stored for a textbook and 
create at least three instance variables, two constructors, and appropriate getters, setters and toString() method. 
Create at least one instance method of your choice.
Create a tester class which creates at least two objects of the business class. 
Invoke various getters, setters and instance method(s) to test the business class.
Comment your code thoroughly.
Grade: 
*/

package TextBook;

public class BusinessTester {
    public static void main(String[] args) {

        Business business1 = new Business();
        System.out.println("Textbook 1");
        business1.Textbook();

        Business business2 = new Business();
        System.out.println("\nTextbook 2");
        business2.setTitle("Rich School of Business by: Elon Musk");
        business2.setYear(2018);
        business2.setPages(325);
        business2.Textbook();

    }
}
