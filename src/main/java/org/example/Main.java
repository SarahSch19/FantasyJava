package org.example;

public class Main {
    public static void main(String[] args) {
        Pharaon ramses = new Pharaon("Ramses", 3000);
        Empire egypte = new Empire(ramses);
        egypte.pharaon.sayMyName();
    }
}