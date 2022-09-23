package Bread;

public class SourdoughBread extends Bread{
    private double dStarter;
    public SourdoughBread(String name, double flour, double water, double salt, double sugar, double bakingPowder, double yeast, boolean isBaked,
                          double dStarter) {
        super(name, flour, water, salt, sugar, bakingPowder, yeast, isBaked);
        this.dStarter = dStarter;
    }

    public double getdStarter() {
        return dStarter;
    }

    public void setdStarter(double dStarter) {
        this.dStarter = dStarter;
    }

    public void recipe(){

        System.out.println("1. Mix flour, water, salt, baking powder, yeast, and ripe sourdough starter.");
        System.out.println("2. Make the dough");
        System.out.println("3. Bulk Rise");
        System.out.println("4. Stretch and fold the dough");
        System.out.println("5. Cut and shape the dough");
        System.out.println("6. Second rise");
        System.out.println("6. Preheat the oven to 450F towards the tail end of the second rise.");
        System.out.println("7. Spray the loaf with luke warm water.");
        System.out.println("8. Bake the bread at 400F for 20 minutes, until deep golden brown.");
        System.out.println("9. Remove the bread from the oven.");
        System.out.println("10.Let the bread cool until good to eat.");
    }
    @Override
    public String toString(){
        return super.toString() + "\n Sourdough Starter: "+ dStarter+" cups";
    }
}

