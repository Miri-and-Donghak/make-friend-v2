package com.miri_and_donghak.makefriend.entity;

import com.miri_and_donghak.makefriend.entity.enums.Accessories;

import java.util.HashSet;

public class Character {
    private int age;

    private String gender;

    private String description;

    public HashSet<Accessories> accessories = new HashSet<>();

    public Character(int age, String gender, String description) {
        this.age = age;
        this.gender = gender;
        this.description = description;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public HashSet<Accessories> getAccessories() {
        return accessories;
    }

    public void setAccessories(HashSet<Accessories> accessories) {
        this.accessories = accessories;
    }

    @Override
    public String toString() {
        return "Character{" +
                "age=" + age +
                ", gender='" + gender + '\'' +
                ", description='" + description + '\'' +
                ", accessories=" + accessories + +'}';
    }
}
