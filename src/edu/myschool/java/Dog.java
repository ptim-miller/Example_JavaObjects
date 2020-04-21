package edu.myschool.java;

public class Dog {
    int age;
    private String name;
    private String barkFile;
    public Dog papaDog;
    public Dog mommaDog;
    public Dog[] sibblings;

    public Dog(String name, int age){
        this.name = name;
        this.age = age;
        this.barkFile = "bark.wav";
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    public void setBarkFile(String barkFile){
        this.barkFile = barkFile;
    }

    public String getBarkFile(){
        return this.barkFile;
    }

    public void bark(){
        Player player = new Player(this.barkFile);
        player.play();
    }

}