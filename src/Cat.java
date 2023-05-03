import java.util.Scanner;

public class Cat extends Pets {
    private String hair;

    //    public Cat(Double height, Double weight, String colorEyes,
//               String name, String breed, Boolean vaccina, String color, String birthday,
//               Boolean hair) {
//        super(height, weight, colorEyes, name, breed, vaccina, color, birthday);
//        this.hair = hair;
//    }
    public Cat() {
        super();
        Scanner in = new Scanner(System.in);
        System.out.println(" Наличие шерсти: ");
        this.hair = in.next();
    }

    @Override
    public void sound() {
        System.out.println("MEOW!");
    }

    @Override
    public void showLove() {
        System.out.println("Мурчание...");
    }

    @Override
    public String showInfo() {
        return "КОТ."+ super.showInfo() + " Наличие шерсти: " + this.hair;
    }

}
