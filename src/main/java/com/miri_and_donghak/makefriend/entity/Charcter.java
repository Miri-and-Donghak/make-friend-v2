package com.miri_and_donghak.makefriend.entity;

import com.miri_and_donghak.makefriend.entity.enums.Accessories;
import com.miri_and_donghak.makefriend.entity.enums.Hairstyle;

import java.util.ArrayList;

public class Charcter {

    private String name;

    private int age;

    private String gender;

    private String description;

    public ArrayList<Accessories> accessories;

    public Hairstyle hairstyle;

    public Charcter(String name, int age, String gender, String description) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.description = description;
    }

    public Charcter(){}


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public void addAccessories(Accessories accessorie) {
        if(accessories == null) accessories = new ArrayList<>();
        this.accessories.add(accessorie);
    }

    public Hairstyle getHairstyle() {
        return hairstyle;
    }

    public void setHairstyle(Hairstyle hairstyle) {
        this.hairstyle = hairstyle;
    }
}
