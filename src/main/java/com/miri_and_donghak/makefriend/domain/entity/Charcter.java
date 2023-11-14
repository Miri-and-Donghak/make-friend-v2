package com.miri_and_donghak.makefriend.domain.entity;

import com.miri_and_donghak.makefriend.domain.entity.enums.Designs;
import jakarta.persistence.*;
import lombok.*;

@Table
@Entity
@Getter @Setter
public class Charcter {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private int age;

    private boolean gender;

    private String description;

    @Embedded
    private Designs designs;

    public Charcter(String name, int age, boolean gender, String description) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.description = description;
    }

    public Charcter(){}
}
