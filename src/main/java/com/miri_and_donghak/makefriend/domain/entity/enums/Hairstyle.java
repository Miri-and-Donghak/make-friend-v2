package com.miri_and_donghak.makefriend.domain.entity.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public enum Hairstyle {
    LONG("hairstyle_long"),
    SHORT("hairstyle_short");

    private String name;

    Hairstyle(String name){
        this.name = name;
    }
}