package org.example;

/**
 * Класс Elephant представляет слона с различными характеристиками.
 * Имплементирует интерфейс Animal.
 */
public class Elephant implements Animal {
    private String name;
    private int age;
    private String gender;
    private String habitat;
    private String diet;
    private int weight;

    /**
     * Конструктор для создания объекта Elephant с указанными параметрами.
     * @param name имя слона
     * @param age возраст слона
     * @param gender пол слона
     * @param habitat место обитания слона
     * @param diet тип питания слона
     * @param weight вес слона
     */
    public Elephant(String name, int age, String gender, String habitat, String diet, int weight) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.habitat = habitat;
        this.diet = diet;
        this.weight = weight;
    }

    /**
     * Метод, который возвращает звук, издаваемый слоном.
     * @return строка со звуком слона.
     */
    @Override
    public String animalSound() {
        return "Слон " + name + " трубит: Ууу!";
    }

    /**
     * Метод, который возвращает подробную информацию о слоне.
     * @return строка с информацией о слоне.
     */
    @Override
    public String getInfo() {
        return "Слон " + name + "\nвозраст: " + age + "\nпол: " + gender + "\nместо обитания: " + habitat +
                "\nпитание: " + diet + "\nвес: " + weight + " кг";
    }
}
