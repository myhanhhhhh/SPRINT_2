import java.util.HashMap;
import java.util.Map;

public class exe_276 {
    public static int converttoNumber(String text){
        int result = 0;
        Map<Character, Integer> laMa = new HashMap<>();
        laMa.put('I',1);
        laMa.put('V',5);
        laMa.put('X',10);
        for (int i = 0; i < text.length(); i++) {
            int currentValue = laMa.get(text.charAt(i));
            if(i<text.length()-1 && currentValue < laMa.get(text.charAt(i+1))){
                result -= currentValue;
            }else {
                result += currentValue;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(converttoNumber("IV"));
    }

}
