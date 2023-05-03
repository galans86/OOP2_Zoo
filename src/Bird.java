import java.util.Scanner;

public abstract class Bird extends Animal {
    private int high;

//    public Bird(Double height, Double weight, String colorEyes, int high) {
//        super(height, weight, colorEyes);
//        this.high = high;
//    }

    public Bird() {
        super();
        Scanner in = new Scanner(System.in);
        System.out.println("Высота полета: ");
        this.high = in.nextInt();
    }

    private String toFly() {
        return "Я лечу на " + this.high + " метрах";
    }

    @Override
    public String showInfo() {
        return super.showInfo() + " " + toFly();
    }
}
