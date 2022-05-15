package models;

import interfaces.Animal;
import org.springframework.stereotype.Component;

/**
 * @author AzatIbraev
 * @Date 13.05.2022
 */

public class Snake implements Animal {

    private String types;
    private int age;
    private String color;

    public Snake() {
    }

    public Snake(String types, int age, String color) {
        this.types = types;
        this.age = age;
        this.color = color;
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void animalPlus() {
        System.out.println("Snakes are elongated, limbless, carnivorous reptiles");
    }

    @Override
    public void animalMinus() {
        System.out.println("The construction of their jaws and bodies enables them to swallow large prey whole");
    }

    @Override
    public String toString() {
        return "Snake{" +
                "types='" + types + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
