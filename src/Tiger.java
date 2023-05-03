import java.util.Date;

public class Tiger extends Wild {
    //    public Tiger(Double height, Double weight, String colorEyes, String habitat, Date dateFound) {
//        super(height, weight, colorEyes, habitat, dateFound);
//    }
    public Tiger() {
        super();
    }

    @Override
    public void sound() {
        System.out.println("ROAR!");
    }

    @Override
    public String showInfo() {
        return "ТИГР."+ super.showInfo();
    }
}
