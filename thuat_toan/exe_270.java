import java.util.Scanner;

public class exe_270 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số");
        int number = scanner.nextInt();
        int result = reverseNumber(number);
        System.out.println(result);
    }

    private static int reverseNumber(int number) {
        int num = 0;

        while (num != 0) {
            int digit = number % 10;
            num = num * 10 + digit;
            number /= 10;
        }
        return num;
    }




}
