package com.miri_and_donghak.makefriend.domain.entity;

import com.miri_and_donghak.makefriend.domain.entity.enums.Accessories;
import com.miri_and_donghak.makefriend.domain.entity.enums.Hairstyle;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;

@Table
@Entity
public class Charcter {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public void setAccessories(ArrayList<Accessories> accessories) {
        this.accessories = accessories;
    }

    public Hairstyle getHairstyle() {
        return hairstyle;
    }

    public void setHairstyle(Hairstyle hairstyle) {
        this.hairstyle = hairstyle;
    }
}
