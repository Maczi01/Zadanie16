public class Car extends Vehicle {

    private boolean airConditioning;

    public Car(String name, int tankVolume, double avarageCombustion, boolean airConditioning) {
        super(name, tankVolume, avarageCombustion);
        this.airConditioning = airConditioning;
    }

    public boolean isAirConditioning() {
        return airConditioning;
    }

    public void setAirConditioning(boolean airConditioning) {
        this.airConditioning = airConditioning;
    }

//    ZŁO
//    void acOn() {
//        double combustionWithAC;
//        if (isAirConditioning()) {
//            combustionWithAC = getAvarageCombustion() + 0.8;
//        }
//    }

    double range() {
//        acOn();   nie może tu być wywolania tej metody
        double r;
        if (isAirConditioning()) {
            r = getTankVolume() / (getAvarageCombustion()+0.8);
            return r;
        } else {
            r = getTankVolume() / getAvarageCombustion();
            return r;
        }
    }
}
