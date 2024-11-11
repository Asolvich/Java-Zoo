package org.example;

/**
 * Класс ZooKeeper отвечает за взаимодействие с животными в зоопарке.
 * Он получает животное в качестве зависимости и вызывает методы для вывода информации и звуков животных.
 */
public class ZooKeeper {
    private Animal animal;  // Зависимость от объекта Animal

    /**
     * Конструктор ZooKeeper, принимающий животное в качестве параметра.
     * @param animal объект, представляющий животное (имплементирует интерфейс Animal).
     */
    public ZooKeeper(Animal animal) {
        this.animal = animal;
    }

    /**
     * Метод, который выводит звук животного в консоль.
     */
    public void makeAnimalSound() {
        System.out.println(animal.animalSound());
    }

    /**
     * Метод, который выводит подробную информацию о животном в консоль.
     */
    public void showAnimalInfo() {
        System.out.println(animal.getInfo());
    }
}
