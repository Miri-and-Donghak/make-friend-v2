package com.miri_and_donghak.makefriend.entity;

import com.miri_and_donghak.makefriend.entity.enums.Accessories;
import com.miri_and_donghak.makefriend.entity.enums.Hairstyle;

import java.util.ArrayList;

public class Character {
    private int age;

    private String gender;

    private String description;

    public ArrayList<Accessories> accessories = new ArrayList<>();

    public Hairstyle hairstyle;

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

    public ArrayList<Accessories> getAccessories() {
        return accessories;
    }

    public void setAccessories(ArrayList<Accessories> accessories) {
        this.accessories = accessories;
    }

    public Hairstyle getHairstyle() {
        return hairstyle;
    }

    public void setHairstyle(Hairstyle hairstyle) {
        this.hairstyle = hairstyle;
    }

    @Override
    public String toString() {
        return "Character{" +
                "age=" + age +
                ", gender='" + gender + '\'' +
                ", description='" + description + '\'' +
                ", accessories=" + accessories +
                ", hairstyle=" + hairstyle +
                '}';
    }
}
