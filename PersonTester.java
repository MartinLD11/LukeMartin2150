/**
 * Name: Luke Martin
 * Class: Itec 2150
 * Description: In the main() method, create an object of class Person called person1 using the no-argument constructor.
 * SOP person1 details using toString().
 * Invoke the appropriate setter method to set/change the name of person1 to “Howard Roark”.
 * Invoke the talk() method on person1.
 * Ensure that all of your code is thoroughly commented.
 * Grade:
 */

package Person;

public class PersonTester {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Howard Roark");
        person1.talk();
    }
}
