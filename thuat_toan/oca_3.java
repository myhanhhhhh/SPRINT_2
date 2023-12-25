public class oca_3 {
     String type = "4w";
    int max = 100;

    oca_3(String type, int max) {
        this.type = type;
        this.max = max;
    }
}

class Car extends oca_3 {
    String trains;
    Car(String trains, String type, int max) {
        super(type,max);
        this.trains = trains;
    }
    Car(String type, int max, String trains ){
        super(type,max);
//        this(trains);
    }
}
