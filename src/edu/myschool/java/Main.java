package edu.myschool.java;

public class Main {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Lildog", 10);
        dog1.bark();
        System.out.println("Name:" + dog1.getName() + " Age:" + dog1.getAge() +
                " File: " + dog1.getBarkFile());

        Dog dog2 = new Dog("Bigdog", 15);
        dog2.setBarkFile("bark2.wav");
        dog2.bark();
        System.out.println("Name:" + dog2.getName() + " Age:" + dog2.getAge()
                + " File: " + dog2.getBarkFile());
    }
}
