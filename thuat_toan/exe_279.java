import java.util.Arrays;

public class exe_279 {
    public static String reverse(String str) {
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        String result = new String(arr);
        return result;
    }

    public static void main(String[] args) {
        String str = "Hello World";
        String result = reverse(str);
        System.out.println(result);
    }

}
