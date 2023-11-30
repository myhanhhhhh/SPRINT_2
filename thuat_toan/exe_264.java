import java.util.Arrays;

public class exe_264 {
    public static void main(String[] args) {
        String string = "abddfghjkuwjemdhBDfjda";
        String sortedString = sortCharacter(string);
        System.out.println(sortedString);
    }

    public static String sortCharacter(String a) {
        String[] arr = a.split("");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].compareTo(arr[j]) > 0) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        String result = String.join("", arr);
        return result;
    }
}