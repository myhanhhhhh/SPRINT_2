package p1;

public class Acc {

    static void getNumber(int value) {
        value = 99;
        System.out.println("Trong phương thức getNumber: value = " + value);
    }
    static void getString(String text) {
        text = "Hola";
        System.out.println("Trong phương thức getString: greeting = " + text);
    }

    public static void main(String[] args) {
        int number = 29;
        System.out.println("Trước khi gọi phương thức: number = " + number);
        getNumber(number);
        System.out.println("Sau khi gọi phương thức: number = " + number);

        String string = "Hello";
        System.out.println("Trước khi gọi phương thức: greeting = " + string);
        getString(string);
        System.out.println("Sau khi gọi phương thức: greeting = " + string);
    }



}
