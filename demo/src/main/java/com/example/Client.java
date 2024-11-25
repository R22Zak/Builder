package com.example;

public class Client {
    private static int idCounter = 0;
    private final int id;
    private final String name;
    private final int age;
    private final String sex;

    public Client(String name, int age, String sex) {
        this.id = idCounter++;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return "Client{id=" + id + ", name='" + name + '\'' +
               ", age=" + age + ", sex='" + sex + '\'' + '}';
    }
}

