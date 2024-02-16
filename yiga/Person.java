package com.yiga;

public class Person {
    String name;
    int age;
    String gender;
    String[] interests;

    public Person(String name, int age, String gender, String[] interests) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.interests = interests;
    }
    public String hello() {
        StringBuilder greeting = new StringBuilder("Hello, my name is ");
        greeting.append(name);
        greeting.append(", my gender is ");
        greeting.append(gender);
        greeting.append(" and I am ");
        greeting.append(age);
        greeting.append(" years old. My interests are ");
        for (int i = 0; i < interests.length; i++) {
            if (i > 0) {
                greeting.append(", ");
            }
            greeting.append(interests[i]);
        }
        greeting.append(".");
        return greeting.toString();
    }
}
