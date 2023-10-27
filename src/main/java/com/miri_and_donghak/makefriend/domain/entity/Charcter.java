package com.miri_and_donghak.makefriend.domain.entity;

import com.miri_and_donghak.makefriend.domain.entity.enums.Accessories;
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

    private String description;

    private ArrayList<Accessories> accessories;
}
