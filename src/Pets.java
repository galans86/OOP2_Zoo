import java.util.Scanner;

public abstract class Pets extends Animal implements IPets {
    //Кличка
    private String name;
    //Порода
    private String breed;
    //Наличие прививок
    private String vaccina;
    //Цвет шерсти
    private String color;
    //Дата рождения
    private String birthday;

    //    public Pets(Double height, Double weight, String colorEyes,
//                String name, String breed, Boolean vaccina, String color, String birthday) {
//        super(height, weight, colorEyes);
//        this.name = name;
//        this.breed = breed;
//        this.vaccina = vaccina;
//        this.color = color;
//        this.birthday = birthday;
//    }
    public Pets() {
        super();
        Scanner in = new Scanner(System.in);
        System.out.println("Имя: ");
        this.name = in.nextLine();

        System.out.println("Порода: ");
        this.breed = in.nextLine();

        System.out.println("Прививка: ");
        this.vaccina = in.nextLine();

        System.out.println("Цвет: ");
        this.color = in.nextLine();

        System.out.println("Дата рождения: ");
        this.birthday = in.nextLine();
    }

    @Override
    public String showInfo() {
        return super.showInfo() +
                " Имя: " + this.name +
                " Порода: " + this.breed +
                " Прививка: " + this.vaccina +
                " Цвет: " + this.color +
                " Дата рождения: " + this.birthday;
    }
}
