import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Student implements Comparable<Student> {
    private String name;
    private double point;

    public Student(String name, double point) {
        this.name = name;
        this.point = point;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", point=" + point +
                '}';
    }
    @Override
    public int compareTo(Student o) {
        if (this.name.compareTo(o.name) == 0) {
            return (int) (this.point - o.point);
        }
        return this.name.compareTo(o.name);
    }
    public static void main(String[] args) {
        List<Student> list= new ArrayList<>();
        list.add(new Student("hanh",7.3));
        list.add(new Student("hanh",6.9));
        Collections.sort(list);
        System.out.println(list);
    }

}
