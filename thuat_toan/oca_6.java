public class oca_6 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(5);
        String s = "";
         if(sb.equals(s)){
             System.out.println("m1");
         } else if (sb.toString().equals(s.toString())) {
             System.out.println("m2");
         }else {
             System.out.println("no");
         }
    }
}
