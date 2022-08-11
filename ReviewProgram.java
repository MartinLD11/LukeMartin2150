/**
* Class name: ReviewProgram.java
* author: Luke Martin
* collaborator: Dr. Hyesung Park
* version 1.1
* description: This program will generate some examples from the ITEC 2140 course.
* this program will show the demo how to call instance method
*/

import java.util.Scanner;
public class ReviewProgram    //class name starts with an upper case. e.g. MyFirstJava --> PascalCase, myVariable --> camelCase
{
  
    public static void main(String [] args)
    {
       ReviewProgram rp= new ReviewProgram();     //create ReviewProgram type object to call instance methods.
        System.out.println("Enter two numbers");
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();
      
        int result = rp.add(number1, number2);
        System.out.println("Result of two numbers " + number1 + " and " + number2 + " is " + result);
      
        int resultStatic = addStatic(number1, number2);
        System.out.println("Result of two numbers " + number1 + " and " + number2 + " is " + resultStatic);
    }
  
    public int add(int firstNum, int secondNum) //instance method/non-static method
    {
      return firstNum + secondNum;
    }
  
     public static int addStatic(int firstNum, int secondNum){
       return firstNum + secondNum;}
  
  
}
