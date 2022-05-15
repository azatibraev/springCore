package models;

import interfaces.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author AzatIbraev
 * @Date 13.05.2022
 */


public class Person {

    private String name;
    private int age;
    private Animal animal;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(Crocodile crocodile) {
    }

    public Person(Snake snake) {
    }

    public void show() {
        animal.animalPlus();
        animal.animalMinus();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    @Override
    public String toString() {
        return "Person{" + '\n' +
                "name='" + name + '\n' +
                "age=" + age + '\n' +
                "animal=" + animal + " }";
    }
}
