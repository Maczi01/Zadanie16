public class Vehicle {

    private String name;
    private int tankVolume;
    private double avarageCombustion;

    public Vehicle(String name, int tankVolume, double avarageCombustion) {
        this.name = name;
        this.tankVolume = tankVolume;
        this.avarageCombustion = avarageCombustion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTankVolume() {
        return tankVolume;
    }

    public void setTankVolume(int tankVolume) {
        this.tankVolume = tankVolume;
    }

    public double getAvarageCombustion() {
        return avarageCombustion;
    }

    public void setAvarageCombustion(double avarageCombustion) {
        this.avarageCombustion = avarageCombustion;
    }
}
