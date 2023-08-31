package com.plantas.control.botanical.repository;

import com.plantas.control.botanical.abtract.Hortaliza;

public class Lechuga extends Hortaliza {
    private String name;
    private String color;
    private int age;

    public Lechuga(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void grow() {

    }

    @Override
    public String toString() {
        return "Lechuga{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
