public class VehicleTest {
    public static void main(String[] args) {
        Vehicle car = new Vehicle("car", 160);
//        car.speed =200;

        car.setSpeed(-10);
        car.showInfo();

        Vehicle plane = new Vehicle("airplane", 1600);
        plane.setSpeed(1099);
        plane.showInfo();
    }
}
