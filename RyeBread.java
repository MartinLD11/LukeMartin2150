package Bread;

public class RyeBread extends Bread{
    private double molasses;
    private double vegOil;
    private double ryeFlour;

    public RyeBread(String name, double flour, double water, double salt, double sugar, double bakingPowder, double yeast,
                    boolean isBaked, double molasses, double vegOil, double ryeFlour) {
        super(name, flour, water, salt, sugar, bakingPowder, yeast, isBaked);
        this.molasses = molasses;
        this.vegOil = vegOil;
        this.ryeFlour = ryeFlour;
    }

    public double getMolasses() {
        return molasses;
    }

    public void setMolasses(double molasses) {
        this.molasses = molasses;
    }

    public double getVegOil() {
        return vegOil;
    }

    public void setVegOil(double vegOil) {
        this.vegOil = vegOil;
    }

    public double getRyeFlour() {
        return ryeFlour;
    }

    public void setRyeFlour(double ryeFlour) {
        this.ryeFlour = ryeFlour;
    }
    public void recipe(){
        System.out.println("1. Dissolve the yeast");
        System.out.println("2. Combine salt, oil, cocoa powder, rye flour, regular flour, and yeast to a bowl " +
                "and mix");
        System.out.println("3. Knead the dough and transfer to a bowl to let it rise for 1 hour");
        System.out.println("4. Cut dough in half and let rise for 30 minutes");
        System.out.println("5. Preheat oven to 350F and Bake for 45 minutes");
        System.out.println("6. Let the loaf cool for 10 minutes(should sound hollow on inside) Serve");
    }
    @Override
    public String toString(){
        return super.toString() + "\nMolasses: " + molasses + " cups\nVegetable Oil: "+vegOil+" cups\nRye Flour: "+ryeFlour+" cups";
    }
}
