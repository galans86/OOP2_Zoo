import java.util.Scanner;

public class Dog extends Pets {
    private String train;

//    public Dog(Double height, Double weight, String colorEyes,
//               String name, String breed, Boolean vaccina, String color, String birthday,
//               Boolean train) {
//        super(height, weight, colorEyes, name, breed, vaccina, color, birthday);
//        this.train = train;
//    }

    public Dog() {
        super();
        Scanner in = new Scanner(System.in);
        System.out.println("Наличие дрессировки:");
        this.train = in.next();
    }
    public String  getTrain() {
        return train;
    }

    public void toTrain() {
        this.train = "да";
    }

    @Override
    public void sound() {
        System.out.println("WOOF!");
    }

    @Override
    public String showInfo() {
       return "СОБАКА."+ super.showInfo() + "Наличие дрессировки:" + this.train;
    }

    @Override
    public void showLove() {
        System.out.println("Виляние хвостом...");
    }

}
