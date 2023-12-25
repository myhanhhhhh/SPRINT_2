import java.util.ArrayList;
import java.util.List;

public class DemoGeneric {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Lien");
        list.add("Hanh");
        String e = list.get(1);
        System.out.println(e);
    }
}
