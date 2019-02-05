import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

//        double[] withOutAC = new double[8];
//        double[] withAC = new double[8];

        Car car1 = new Car("Lada", 75, 9.5, true);
        Car car2 = new Car("Wartburg", 65, 7.7, false);
        Car car3 = new Car("Zastava", 54, 6.2, false);
        Car car4 = new Car("Moskiwcz", 50, 9.6, true);
        Car truck1 = new Truck("KAMAZ", 410, 12.2, true, 700);
        Car truck2 = new Truck("IFA", 350, 13.2, true, 600);
        Car truck3 = new Truck("STAR", 500, 16.3, true, 1000);
        Car truck4 = new Truck("Robur", 200, 14.9, false, 300);

        Car[] cars = {car1,car2,car3,car4,truck1, truck2, truck3, truck4};
        System.out.println("Klimatyzacja wylaczona: ");
        for (Car c : cars) {
            c.setAirConditioning(false);
            c.showInfo();
            System.out.println();
        }

        System.out.println("Po wlaczeniu klimatyzacji: ");
        for (Car c : cars) {
            c.setAirConditioning(true);
            c.showInfo();
            System.out.println();
        }
        System.out.println("----");
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i].getName() + " z wylaczona klimatyzacja przejedzie o "
                    + withAndWithoutAC(cars[i]) +" km wiecej.");
        }

    }

    static double withAndWithoutAC(Car c){
        double withAC;
        double withoutAC;
        double diff;
        c.setAirConditioning(true);
        withAC = c.range();
        c.setAirConditioning(false);
        withoutAC = c.range();
        diff = Math.round(withoutAC-withAC);
        return diff;
    }

    }

