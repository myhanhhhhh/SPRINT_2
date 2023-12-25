import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class exe_275 {
    public static Map<Integer, Integer> findNumber(int[] num, int number) {
        Map<Integer, Integer> map = new HashMap();
        int result;
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] + num[j] == number) {
                    map.put(i + 1, j + 1);
                }
            }
        }
        return map;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println(findNumber(arr, 9));
    }
}
