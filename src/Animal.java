import java.util.Scanner;

public abstract class Animal implements IAnimal {
    private Integer height;
    private Integer weight;
    private String colorEyes;

//    public Animal(Double height, Double weight, String colorEyes) {
//        this.height = height;
//        this.weight = weight;
//        this.colorEyes = colorEyes;
//    }

    public Animal() {
        Scanner in = new Scanner(System.in);
        System.out.println("Рост: ");
        this.height = in.nextInt();

        System.out.println("Вес: ");
        this.weight = in.nextInt();

        System.out.println("Цвет глаз: ");
        this.colorEyes = in.next();
    }

    public String showInfo() {
        return "Рост: " + this.height +
                " Вес: " + this.weight +
                " Цвет глаз: " + this.colorEyes;
    }
}

