package Bread;

public class FrenchBread extends Bread{
    private double oliveOil;
    private double butter;

    public FrenchBread(String name, double flour, double water, double salt, double sugar, double bakingPowder,
                       double yeast, boolean isBaked, double oliveOil, double butter) {
        super(name, flour, water, salt, sugar, bakingPowder, yeast, isBaked);
        this.oliveOil = oliveOil;
        this.butter = butter;
    }

    public double getOliveOil() {
        return oliveOil;
    }

    public void setOliveOil(double oliveOil) {
        this.oliveOil = oliveOil;
    }

    public double getButter() {
        return butter;
    }

    public void setButter(double butter) {
        this.butter = butter;
    }
    public void recipe(){
        System.out.println("1. Combine ingredients into a small bowl and knead dough until smooth and let rise for 1 hour");
        System.out.println("2. Knead again and cover with olive oil and let rise for 30 minutes");
        System.out.println("3. Split dough and roll into two loaf on different baking sheets and preheat oven to 400F");
        System.out.println("4. Bake dough for 17 - 23 minutes. Let cool and serve");
    }
    @Override
    public String toString(){
        return super.toString()+ "\nOlive Oil: "+ oliveOil+ " teaspoons\nButter: "+butter+" teaspoons";
    }
}
