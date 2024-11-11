package org.example;
import org.example.ZooKeeper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Класс Main запускает Spring-приложение, которое демонстрирует работу с зоопарком.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("zoo-config.xml");

        ZooKeeper zooKeeperForLion = context.getBean("zooKeeperForLion", ZooKeeper.class);
        // Выводим звук животного
        zooKeeperForLion.makeAnimalSound();
        // Выводим информацию о животном
        zooKeeperForLion.showAnimalInfo();

        System.out.println("");

        ZooKeeper zooKeeperForElephant = context.getBean("zooKeeperForElephant", ZooKeeper.class);
        // Выводим звук животного
        zooKeeperForElephant.makeAnimalSound();
        // Выводим информацию о животном
        zooKeeperForElephant.showAnimalInfo();

        ((ClassPathXmlApplicationContext) context).close();
    }
}