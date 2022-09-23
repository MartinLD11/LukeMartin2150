package Bread;

public class Bread {
    private String name;
    private double flour;
    private double water;
    private double salt;
    private double sugar;
    private double bakingPowder;
    private double yeast;
    private boolean isBaked;

    public Bread(String name, double flour, double water, double salt, double sugar, double bakingPowder, double yeast, boolean isBaked) {
        this.name = name;
        this.flour = flour;
        this.water = water;
        this.salt = salt;
        this.sugar = sugar;
        this.bakingPowder = bakingPowder;
        this.yeast = yeast;
        this.isBaked = isBaked;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFlour() {
        return flour;
    }

    public void setFlour(double flour) {
        this.flour = flour;
    }

    public double getWater() {
        return water;
    }

    public void setWater(double water) {
        this.water = water;
    }

    public double getSalt() {
        return salt;
    }

    public void setSalt(double salt) {
        this.salt = salt;
    }

    public double getSugar() {
        return sugar;
    }

    public void setSugar(double sugar) {
        this.sugar = sugar;
    }

    public double getBakingPowder() {
        return bakingPowder;
    }

    public void setBakingPowder(double bakingPowder) {
        this.bakingPowder = bakingPowder;
    }

    public double getYeast() {
        return yeast;
    }

    public void setYeast(double yeast) {
        this.yeast = yeast;
    }

    public boolean isBaked() {
        return isBaked;
    }

    public void setBaked(boolean baked) {
        isBaked = baked;
    }

    public void baked(){
        System.out.println("The Bread/Pastry is Baked");
    }
    public void notBaked(){
        System.out.println("The Bread/Pastry is not Baked");
    }
    public void getIngredients(){
        System.out.println("Recipe: " + name);
        System.out.println("Flour: " + flour +" cups");
        System.out.println("Water: "+water+ " cups");
        System.out.println("Salt: "+ salt+" teaspoons");
        System.out.println("Sugar: "+ sugar+" teaspoons");
        System.out.println("Baking Powder: " + bakingPowder +" cups");
        System.out.println("Yeast: "+yeast+ " teaspoons");

    }
    @Override
    public String toString(){
        return "Name: " + name + "\n Flour: " + flour  + " cups\nWater: " + water + " cups\n Salt: "+ salt+ " teaspoons\n Sugar: "+ sugar+
                " teaspoons\n Backing Powder: " + bakingPowder + " cups\nYeast: "+ yeast + " teaspoons";
    }
}
