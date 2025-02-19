import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class LoopTest {
    public static void main(String[] args) {
        Parking parking1 = new Parking("PARk1","CARNUM1");
        Parking parking2 = new Parking("PARk2","CARNUM2");
        Parking parking3 =new Parking("PARk3","CARNUM3");
        Parking parking4 =new Parking("PARk4","CARNUM4");
        Parking parking5 =new Parking("PARk5","CARNUM5");

        List <Parking>parkingList = new ArrayList<>();

        parkingList.add(parking1);
        parkingList.add(parking2);
        parkingList.add(1, parking3);
        parkingList.add(parking4);
        parkingList.add(parking5);

        for (int i = 0; i < parkingList.size(); i++) {
            Parking parking =  parkingList.get(i);
            System.out.println(parking);
        }

        System.out.println("-----------------");

        for(Object item:parkingList){
            System.out.println(item);
        }

        System.out.println("-----------------");
        // Create a iterator
        Iterator it = parkingList.iterator();
        // Loop through the list
        while (it.hasNext()) {
            Parking parking = (Parking) it.next();
            System.out.println(parking);
        }

        List nameList = new ArrayList<>();;
        nameList.add("John");
        nameList.add("Tom");
        System.out.println("Before removing"+nameList);
        Iterator it2 = nameList.iterator();
        while (it2.hasNext()) {
            Object next=it2.next();
            if(next == "Tom"){
                it2.remove();
            }
        }
        System.out.println("After removing"+nameList);
    }
}
