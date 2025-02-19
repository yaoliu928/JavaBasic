import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class LoopTest {
    public static void main(String[] args) {
        Parking parking1 = new Parking("PARk1","CARNUM1");
        Parking parking2 = new Parking("PARk2","CARNUM2");
        Parking parking3 =new Parking("PARk3","CARNUM3");
        Parking parking4 =new Parking("PARk4","CARNUM4");
        Parking parking5 =new Parking("PARk5","CARNUM5");

        List parkingList = new ArrayList<>();

        parkingList.add(parking1);
        parkingList.add(parking2);
        parkingList.add(1, parking3);
        parkingList.add(parking4);
        parkingList.add(parking5);

        for (int i = 0; i < parkingList.size(); i++) {
            Parking parking = (Parking) parkingList.get(i);
            System.out.println(parking);
        }

        System.out.println("-----------------");

        for(Object item:parkingList){
            System.out.println(item);
        }
    }
}
