public class Chicken extends Bird {
    //    public Chicken(Double height, Double weight, String colorEyes, int high) {
//        super(height, weight, colorEyes, high);
//    }
    public Chicken() {
        super();
    }

    @Override
    public void sound() {
        System.out.println("CLUCK!");
    }

    @Override
    public String showInfo() {
        return "КУРИЦА."+ super.showInfo();
    }
}
