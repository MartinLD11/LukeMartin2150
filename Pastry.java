package Bread;

public class Pastry extends Bread{
    private int eggs;
    private double cocaP;
    private double vExtract;
    private double jam;

    public Pastry(String name, double flour, double water, double salt, double sugar, double bakingPowder, double yeast, boolean isBaked,
                  int eggs, double cocaP, double vExtract, double jam) {
        super(name, flour, water, salt, sugar, bakingPowder, yeast, isBaked);
        this.eggs = eggs;
        this.cocaP = cocaP;
        this.vExtract = vExtract;
        this.jam = jam;
    }

    public int getEggs() {
        return eggs;
    }

    public void setEggs(int eggs) {
        this.eggs = eggs;
    }

    public double getCocaP() {
        return cocaP;
    }

    public void setCocaP(double cocaP) {
        this.cocaP = cocaP;
    }

    public double getvExtract() {
        return vExtract;
    }

    public void setvExtract(double vExtract) {
        this.vExtract = vExtract;
    }

    public double getJam() {
        return jam;
    }

    public void setJam(double jam) {
        this.jam = jam;
    }
    public void recipe(){
        System.out.println("1. Heat oven to 350F and coat cooking sheet with butter and flour");
        System.out.println("2. Sift " + getFlour() + " cups of flour, salt and baking soda." );
        System.out.println("3. Add water to the flour until it becomes smooth");
        System.out.println("4. Beat the butter for 30 seconds, then add sugar and eggs and beat for another 30");
        System.out.println("5. Combine butter mixture and flour mixture");
        System.out.println("6. Cut into squares and full with Blueberry Jam");
        System.out.println("7. Place on cooking sheet and bake for 30 minutes");
        System.out.println("8. Cool for 30 minutes and serve");
    }
    @Override
    public  String toString(){
        return super.toString() + "\nEggs: " +eggs + " eggs\n Coca Powder: " + cocaP +
                " teaspoons\n Vanilla Extract: "+ vExtract + " teaspoons \n Jam: " + jam + " tablespoons";
    }
}
