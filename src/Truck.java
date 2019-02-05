public class Truck extends Car {

    private int loadWeight;

    public Truck(String name, int tankVolume, double avarageCombustion, boolean airConditioning, int loadWeight) {
        super(name, tankVolume, avarageCombustion, airConditioning);
        this.loadWeight = loadWeight;
    }

    public int getLoadWeight() {
        return loadWeight;
    }

    public void setLoadWeight(int loadWeight) {
        this.loadWeight = loadWeight;
    }

    double combustionWithLoad() {
        int count;
        double withLoad;
        count = getLoadWeight() / 100;
        withLoad = getAvarageCombustion()+ (getAvarageCombustion()*count*0.5);
        return withLoad;
    }


    double range() {
        double r;
        if (isAirConditioning()) {
            r = (getTankVolume() / (getAvarageCombustion() + 1.6 + combustionWithLoad()))*100;
            return r;
        } else {
            r = (getTankVolume() / (getAvarageCombustion()+combustionWithLoad()))*100;
            return r;
        }
    }

    @Override
    void showInfo() {
        super.showInfo();
        System.out.print(" Maksymalna ladownosc pojazdu " + getName() + " to " + loadWeight);
    }
}
