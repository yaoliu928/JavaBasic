import java.util.Comparator;

public class MyComparator implements Comparator<Family> {
    @Override
    public int compare(Family o1, Family o2) {
        float result = o2.getFamilyScore() - o1.getFamilyScore();
        if (result == 0) {
            return o1.getRegTime().compareTo(o2.getRegTime());
        } else if (result > 0) {
            return 1;
        } else {
            return -1;

        }
    }
}
