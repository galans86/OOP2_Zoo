import java.util.ArrayList;

public class Zoo {
    private ArrayList<Animal> animals; //

    public Zoo() {
        animals = new ArrayList<Animal>();
    }

    //Добавить животное в зоопарк
    public void addAnimal(Animal animal) {
        if (animal != null) {
            this.animals.add(animal);
        }

    }

    //Убирает животное с номером i из зоопарка
    public void deleteAnimal(int index) {
     try{
            this.animals.remove(index);
        } catch (Exception e) {
         //
     }
    }

    //Посмотреть информацию о животном с номером i
    public void showInfo(int index) {
        try{
            System.out.println(this.animals.get(index).showInfo());
        } catch (Exception e) {
            //
        }
    }

    //Заставить животное с номером i издать звук
    public void sound(int index) {
        try{
            this.animals.get(index).sound();
        } catch (Exception e) {
            //
        }
    }

    //Напечатать информацию о животных, которые есть на данный момент в зоопарке
    public void zooInfo() {
        for (Animal animal : this.animals) {
            System.out.println(animal.showInfo());
        }
    }

    //Заставить всех животных, которые на данный момент есть в зоопарке, издать звук
    public void zooSound() {
        for (Animal animal : this.animals) {
            animal.sound();
        }
    }
}
