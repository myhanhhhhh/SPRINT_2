import java.util.ArrayList;
import java.util.List;

public class exe_273 {
    public static String decimalToOctal(int num) {
        if (num == 0) {
            return "0";
        }

        List<Integer> arrayList = new ArrayList<>();
        int remainder;

        while (num > 0) {
            remainder = num % 8;
            arrayList.add( remainder);
            num /= 8;
        }

        return arrayList.toString();
    }

    public static void main(String[] args) {
        int decimalNumber = 157;
        String octalNumber = decimalToOctal(decimalNumber);

        System.out.println("Số " + decimalNumber + " ở hệ bát phân là: " + octalNumber);
    }

}
