package org.example;

public class Pharaon {
    public String name;
    public int age;

    public Pharaon (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayMyName() {
        System.out.println("Je m'appelle " + this.name);
    }
}
