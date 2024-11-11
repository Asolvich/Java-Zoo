package org.example;

/**
 * Класс Lion представляет льва с различными характеристиками.
 * Имплементирует интерфейс Animal.
 */
public class Lion implements Animal {
    private String name;
    private int age;
    private String gender;
    private String habitat;
    private String diet;
    private int speed;

    /**
     * Конструктор для создания объекта Lion с указанными параметрами.
     * @param name имя льва
     * @param age возраст льва
     * @param gender пол льва
     * @param habitat место обитания льва
     * @param diet тип питания льва
     * @param speed максимальная скорость льва
     */
    public Lion(String name, int age, String gender, String habitat, String diet, int speed) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.habitat = habitat;
        this.diet = diet;
        this.speed = speed;
    }

    /**
     * Метод, который возвращает звук, издаваемый львом.
     * @return строка со звуком льва.
     */
    @Override
    public String animalSound() {
        return "Лев " + name + " рычит: Ррр!";
    }

    /**
     * Метод, который возвращает подробную информацию о льве.
     * @return строка с информацией о льве.
     */
    @Override
    public String getInfo() {
        return "Лев " + name + "\nвозраст: " + age + "\nпол: " + gender + "\nместо обитания: " + habitat +
                "\nпитание: " + diet + "\nскорость: " + speed + " км/ч";
    }
}