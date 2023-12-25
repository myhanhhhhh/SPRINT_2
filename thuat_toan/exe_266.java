import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class exe_266 {
    public static List<String> processString(String input) {
        List<String> words = new ArrayList<>();

        // Tách các từ trong chuỗi bằng dấu cách
        String[] splitWords = input.split(" ");

        // Lặp qua từng từ trong mảng splitWords
        for (String word : splitWords) {
            // Loại bỏ các ký tự đặc biệt và chuyển đổi thành chữ thường
            word = word.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

            // Kiểm tra xem từ đã tồn tại trong danh sách chưa
            if (!words.contains(word)) {
                words.add(word);
            }
        }

        return words;
    }

    public static void main(String[] args) {
        String input = "This is a string. This string test words.";
        List<String> uniqueWords = processString(input);

        // In ra danh sách các từ không trùng lặp
        System.out.println("Các từ không trùng lặp: " + uniqueWords);
    }
}



