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

    void acOn(){
        if(isAirConditioning()){
            setAvarageCombustion(getAvarageCombustion()+0.8);
        }
    }

    double range(){
        acOn();
        double r = getTankVolume()/getAvarageCombustion();
        return r;
    }
}
