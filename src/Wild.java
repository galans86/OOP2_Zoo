import java.util.Scanner;

public abstract class Wild extends Animal {
    //Место обитания
    private String habitat;
    //Дата нахождения
    private String dateFound;

//    public Wild(Double height, Double weight, String colorEyes, String habitat, Date dateFound) {
//        super(height, weight, colorEyes);
//        this.habitat = habitat;
//        this.dateFound = dateFound;
//    }
public Wild() {
    super();
    Scanner in = new Scanner(System.in);
    System.out.println("Место обитания: ");
    this.habitat = in.nextLine();
    System.out.println("Дата нахождения: ");
    this.dateFound = in.nextLine();
}
    public String showInfo() {
        return super.showInfo() +
                "Место обитания: " + this.habitat +
                "Дата нахождения:" + this.dateFound;
    }
}
