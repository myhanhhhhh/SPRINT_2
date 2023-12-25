package p2;

import p1.Acc;

public class Test  {
    public static void main(String[] args) {
        boolean isStatus = true;
        if (isStatus) {
            System.out.println("OKE!");
        } else {
            System.out.println("FAIL!");
        }

        Boolean isObject = Boolean.valueOf(true);
        if (isObject) {
            System.out.println("OKE!");
        } else {
            System.out.println("FAIL!");
        }
    }
}
