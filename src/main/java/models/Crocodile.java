package models;

import interfaces.Animal;

/**
 * @author AzatIbraev
 * @Date 13.05.2022
 */

public class Crocodile implements Animal {

    private String types;
    private int age;
    private String color;

    public Crocodile() {
    }

    public Crocodile(String types, int age, String color) {
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
        System.out.println("A crocodiles is a large amphibious reptile");
    }

    @Override
    public void animalMinus() {
        System.out.println("A crocodiles have the most powerful bite of any animal on the planet");
    }

    @Override
    public String toString() {
        return "Crocodile{" +
                "types='" + types + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
