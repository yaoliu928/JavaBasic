import java.util.ArrayList;
import java.util.List;

public class ParkingTest {

    public static void main(String[] args) {
        Parking parking1 = new Parking("PARk1","CARNUM1");
        Parking parking2 = new Parking("PARk2","CARNUM2");
        Parking parking3 =new Parking("PARk3","CARNUM3");

        List parkingList = new ArrayList<>();

        parkingList.add(parking1);
        parkingList.add(parking2);
        parkingList.add(1, parking3);


        System.out.println(parkingList.get(0));
        System.out.println(parkingList.get(1));
        System.out.println(parkingList.get(2));
        System.out.println(parkingList.size());

        parkingList.remove(1);

        int index = parkingList.indexOf(parking3);
        System.out.println(index);

        parkingList.clear();
        parkingList.isEmpty();
        System.out.println(parkingList.isEmpty());
    }
}
