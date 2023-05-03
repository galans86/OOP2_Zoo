import java.util.Date;
import java.util.Scanner;

public class Wolf extends Wild {
    private String packLead;

//    public Wolf(Double height, Double weight, String colorEyes, String habitat, Date dateFound,
//                Boolean packLead) {
//        super(height, weight, colorEyes, habitat, dateFound);
//        this.packLead = packLead;
//    }
public Wolf() {
    super();
    Scanner in = new Scanner(System.in);
    System.out.println("Вожак стаи: ");
    this.packLead = in.next();
}
    @Override
    public void sound() {
        System.out.println("AUF!");
    }

    @Override
    public String showInfo() {
        return "ВОЛК."+ super.showInfo() + "Вожак стаи: " + this.packLead;
    }

    public String getPackLead() {
        return packLead;
    }
}
