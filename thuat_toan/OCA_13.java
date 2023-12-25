public class OCA_13 {
    static int i;
    int j ;

    public static void main(String[] args) {
        OCA_13 X1= new OCA_13();
        OCA_13 X2= new OCA_13();
        X1.i = 3;
        X1.j = 4;
        X2.i = 5;
        X2.j = 6;
        System.out.println(
                X1.i + " " +
                X1.j + " " +
                X2.i + " " +
                X2.j
        );
    }
}
