public class Truck extends Car{

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

    void acOn(){
        if(isAirConditioning()){
            setAvarageCombustion(getAvarageCombustion()+1.6);
        }
    }
    void combustionWithLoad(){
        int count = getLoadWeight()/100;
        setAvarageCombustion(getAvarageCombustion()*count*0.5);
    }

    double range(){
        acOn();
        combustionWithLoad();
        double r = getTankVolume()/getAvarageCombustion();
        return r;
    }
}
