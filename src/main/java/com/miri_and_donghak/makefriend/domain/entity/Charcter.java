package com.miri_and_donghak.makefriend.domain.entity;

import com.miri_and_donghak.makefriend.domain.entity.enums.Accessories;
import com.miri_and_donghak.makefriend.domain.entity.enums.Hairstyle;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;

@Table
@Entity
@Getter @Setter
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
}
