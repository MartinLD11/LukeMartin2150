package Bread;

public class Croissants extends Bread{
    private double oil;
    private double butter;

    public Croissants(String name, double flour, double water, double salt, double sugar, double bakingPowder, double yeast,
                      boolean isBaked, double oil, double butter) {
        super(name, flour, water, salt, sugar, bakingPowder, yeast, isBaked);
        this.oil = oil;
        this.butter = butter;
    }

    public double getOil() {
        return oil;
    }

    public void setOil(double oil) {
        this.oil = oil;
    }

    public double getButter() {
        return butter;
    }

    public void setButter(double butter) {
        this.butter = butter;
    }
    public void recipe(){
        System.out.println("1. Let yeast rise in water and combine other ingredients");
        System.out.println("2. Roll out mixer on a baking sheet and let chill for 20 minutes");
        System.out.println("3. Cut into 20 X 15 rectangles and roll from one corner to the end and chill");
        System.out.println("4. Preheat oven to 400F and bake for 15 - 20 minutes");
        System.out.println("5. Let cool on wire rack and serve");
    }
    @Override
    public String toString(){
        return super.toString() + "\nOil: "+oil+" teaspoons\nButter: "+butter+" teaspoons";
    }
}
