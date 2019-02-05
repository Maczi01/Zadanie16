import java.text.NumberFormat;


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

    double range() {
        double r;
        if (isAirConditioning()) {
            r = (getTankVolume() / (getAvarageCombustion()+0.8))*100;
            return r;
        } else {
            r = (getTankVolume() / getAvarageCombustion())*100;
            return r;
        }
    }

    void showInfo(){
        System.out.print(getName() + " ma bak o pojemnosci ");
        System.out.print(getTankVolume() + " i spalanie okolo ");
        System.out.print(getAvarageCombustion());
        System.out.print(". Zasieg pojazdu " + getName() + " to "+Math.round(range()));

    }
}
