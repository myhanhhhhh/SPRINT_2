import java.util.ArrayList;
import java.util.List;

public class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public Person() {
    }

    // Khai báo một ArrayList static để lưu trữ danh sách các đối tượng Person
    static ArrayList<Person> list = new ArrayList<>();

    // Khối static: thêm một số đối tượng Person vào list khi lớp được tải
    static {
        list.add(new Person(1, "Lien"));
        list.add(new Person(2, "Hanh"));
    }

    // Phương thức static để thêm một đối tượng Person mới vào list
    public static void add(Person person) {
        list.add(person);
    }

    // Lớp tĩnh (static nested class) bên trong lớp Person
    static class StaticNestedClass {
        void display() {
            // Tạo một đối tượng Person trong lớp tĩnh
            Person person = new Person();
        }
    }
    public static void main(String[] args) {
        // Tạo một đối tượng từ static nested class và gọi phương thức display()
        StaticNestedClass nestedClass = new StaticNestedClass();
        nestedClass.display();

        for (Person p : list) {
            System.out.println(p.id + ": " + p.name);
        }
    }

}
