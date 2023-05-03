import java.util.Scanner;

public class Menu {
    private String menu1() {
        return "\n Действия: \n" +
                "1. Добавить животное в зоопарк\n" +
                "2. Убрать животное из зоопарка\n" +
                "3. Показать информацию об одном животном зоопарка \n" +
                "4. Показать информацию обо всех животных зоопарках\n" +
                "5. Издать звук одного животного зоопарка\n" +
                "6. Издать звуки всех животных зоопарка\n" +
                "0. выход\n";
    }

    private Animal menu_addPets() {
        Scanner in = new Scanner(System.in);
        int itemMenu = 0;

        System.out.println("Выберите животное: \n" +
                "1. Кот\n" +
                "2. Собака\n" +
                "3. Тигр\n" +
                "4. Волк\n" +
                "5. Аист\n" +
                "6. Курица\n" +
                "0. выход\n");
        itemMenu = in.nextInt();
        switch (itemMenu) {
            case 1:
                return (Animal) new Cat();
            case 2:
                return (Animal) new Dog();
            case 3:
                return (Animal) new Tiger();
            case 4:
                return (Animal) new Wolf();
            case 5:
                return (Animal) new Stork();
            case 6:
                return (Animal) new Chicken();
            default:
                break;
        }
        return null;
    }

    public void choice() {
        Scanner in = new Scanner(System.in);
        int itemMenu = 1;
        int index = 0;
        Zoo zoo = new Zoo();

        while (itemMenu != 0) {
            System.out.print(this.menu1());
            itemMenu = in.nextInt();
            switch (itemMenu) {
                case 1:
                    zoo.addAnimal(this.menu_addPets());
                    break;
                case 2:
                    System.out.println("Введите индекс:");
                    zoo.deleteAnimal(in.nextInt() - 1);
                    break;
                case 3:
                    System.out.println("Введите индекс:");
                    zoo.showInfo(in.nextInt() - 1);
                    break;
                case 4:
                    zoo.zooInfo();
                    break;
                case 5:
                    System.out.println("Введите индекс:");
                    zoo.sound(in.nextInt() - 1);
                    break;
                case 6:
                    zoo.zooSound();
                    break;
                default:
                    itemMenu = 0;
                    break;
            }
            ;
        }

    }
}
