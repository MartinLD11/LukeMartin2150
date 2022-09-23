package Bread;

import java.io.PrintStream;

public class BreadTester {
    public static void main(String[] args) {

        SourdoughBread sb = new SourdoughBread("Sourdough Bread",3,2,2,3,2,1.25, true, 3);
        Pastry pastry = new Pastry("Blueberry Pastry",3,2,2,5,1,1,true,1,1.5,1, 1);
        RyeBread ryeBread = new RyeBread("Rye Bread", 5,2.5, 1, 0, 0, 4.5, true, 0.67, 0.25,2);
        Croissants croissant = new Croissants("Croissant", 2.5, 0, 1.25, 1, 0, 2, true,2,3 );
        FrenchBread fBread = new FrenchBread("French Bread", 5, 2, 2.5, 2.5, 0, 1, true, 1, 2);

        System.out.println(sb+ "\n");
        System.out.println(sb.getName() + " recipe");
        sb.recipe();
        sb.baked();

        System.out.println("\n" + pastry);
        System.out.println("\n"+pastry.getName() + " recipe");
        pastry.recipe();
        pastry.baked();

        System.out.println("\n" + ryeBread);
        System.out.println("\n"+ryeBread.getName() + " recipe");
        ryeBread.recipe();
        ryeBread.baked();

        System.out.println("\n" +croissant);
        System.out.println("\n"+ croissant.getName()+ " recipe");
        croissant.recipe();
        croissant.baked();

        System.out.println("\n" + fBread);
        System.out.println("\n" + fBread.getName() + " recipe");
        fBread.recipe();
        fBread.baked();
    }
}
