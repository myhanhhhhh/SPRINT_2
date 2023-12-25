import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PointComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getName().compareTo(o2.getName()) == 0) {
            return (int) (o2.getPoint() - o1.getPoint());
        }
        return o1.getName().compareTo(o2.getName());
    }

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("hanh", 7.3));
        list.add(new Student("hanh", 6.9));

        PointComparator pointComparator = new PointComparator();
        Collections.sort(list, pointComparator);
        System.out.println(list);
    }
}
