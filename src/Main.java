public class Main {

    public static void main(String[] args) {

        Car car1 = new Car("Lada", 75, 9.5, true);
        Car car2 = new Car("Wartburg", 67, 9.1, false);
        Car car3 = new Car("Zastava", 54, 6.2, false);
        Car car4 = new Car("Moskiwcz", 50, 9.6, true);
        Car truck1 = new Truck("KAMAZ", 200, 13.2, true, 600);
        Car truck2 = new Truck("IFA", 200, 13.2, true, 600);
        Car truck3 = new Truck("STAR", 200, 16.3, true, 1000);
        Car truck4 = new Truck("Robur", 200, 14.9, false, 300);

        Car[] cars = {car1,car2,car3,car4,truck1, truck2, truck3, truck4};
        for (Car c: cars) {
            System.out.println(c.getName() + " ma zasieg " + c.range() + " km.");
        }
    }
}
