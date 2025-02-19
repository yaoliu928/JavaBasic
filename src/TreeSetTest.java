import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        Parking parking1 = new Parking("PARk1", "CARNUM1");
        Parking parking2 = new Parking("PARk2", "CARNUM2");
        Parking parking3 = new Parking("PARk3", "CARNUM3");

        TreeSet<Parking> parkingSet = new TreeSet<>();

        parkingSet.add(parking1);
        parkingSet.add(parking2);
        parkingSet.add(parking3);

        for (Parking parking : parkingSet) {
            System.out.println(parking);
        }

        /**
         * Case 3: Custom Object - Comparator Sorting
         * Requirement: Sort by familyScore in descending order. If the score are the same, sort by registration time.
         * Approach:
         * 1. Define a subclass and implement the Comparator interface.
         * 2. Override the compare method.
         * 3. Create subclass objects.
         * 4. Pass the subclass object as a parameter to a TreeSet collection.
         */

        MyComparator myComparator = new MyComparator();

        TreeSet<Family> familySet = new TreeSet<>(myComparator);
        Family family1 = new Family("FAM1", 100, "2021-01-01");
        Family family2 = new Family("FAM2", 200, "2021-01-02");
        Family family3 = new Family("FAM3", 300, "2021-01-06");
        Family family4 = new Family("FAM30", 300, "2021-01-03");
        Family family5 = new Family("FAM13", 500, "2021-01-03");
        Family family6 = new Family("FAM23", 300, "2021-01-13");

        familySet.add(family1);
        familySet.add(family2);
        familySet.add(family3);
        familySet.add(family4);
        familySet.add(family5);
        familySet.add(family6);

        for (Family family : familySet) {
            System.out.println(family);
        }
    }
}
