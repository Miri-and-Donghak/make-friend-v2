package com.miri_and_donghak.makefriend.entity.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public enum Hairstyle {
    HAIRSTYLE_LONG("hairstyle_long"),
    HAIRSTYLE_SHORT("hairstyle_short");

    private String name;

    Hairstyle(String name){
        this.name = name;
    }
}