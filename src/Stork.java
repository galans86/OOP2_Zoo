public class Stork extends Bird {
    //    public Stork(Double height, Double weight, String colorEyes, int high) {
//        super(height, weight, colorEyes, high);
//    }
    public Stork() {
        super();
    }

    @Override
    public void sound() {
        System.out.println("TKTKTKTKTTK!");
    }

    @Override
    public String showInfo() {
        return "АИСТ."+ super.showInfo();
    }
}
