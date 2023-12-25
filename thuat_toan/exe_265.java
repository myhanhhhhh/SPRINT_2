import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class exe_265 {
    public static List<Integer> findNumber(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map = new HashMap<>();

        List<Integer> array = new ArrayList<>();

        // Lặp qua mảng đầu tiên và tăng giá trị đếm số lần xuất hiện trong Map
        for (int num : arr1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Lặp qua mảng thứ hai và kiểm tra số lần xuất hiện trong Map
        for (int num : arr2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                array.add(num);
                map.put(num, map.get(num) - 1);
            }
        }

        return array;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};
        List<Integer> number = findNumber(arr1, arr2);
        System.out.println(number);
    }
}
