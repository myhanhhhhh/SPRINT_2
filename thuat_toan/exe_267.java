import java.util.HashMap;
import java.util.Map;

public class exe_267 {
    public static void main(String[] args) {
        String[] array = {"apple", "orange", "banana", "apple", "grape", "banana", "apple"};

        // Loại bỏ giá trị trùng lặp và đếm số lần xuất hiện
        processArray(array);
    }

    public static void processArray(String[] array) {
        // HashMap để lưu trữ số lần xuất hiện của từng phần tử
        Map<String, Integer> frequencyMap = new HashMap<>();

        // Vòng lặp để đếm số lần xuất hiện và loại bỏ giá trị trùng lặp
        for (String element : array) {
            // Lấy giá trị hiện tại của phần tử trong Map (nếu có)
                    Integer count = frequencyMap.get(element);

            // Nếu phần tử chưa xuất hiện trong Map, thì đặt count là 1, ngược lại tăng count lên 1
            count = (count == null) ? 1 : count + 1;

            // Cập nhật giá trị của phần tử trong Map
            frequencyMap.put(element, count);
        }

        // In ra kết quả
        System.out.println("Mảng sau khi loại bỏ giá trị trùng lặp:");
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " lần");
        }

    }
}
