import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class exe_277 {

    public static int findSecondMax(int[] arr) {
        Arrays.sort(arr);

        int max = arr[arr.length - 1];
        int second = max;
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] < max) {
                second = arr[i];
                break;
            }
        }
        return second;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 2, 5, 5, 4, 5};
        System.out.println(findSecondMax(arr));
    }
}
