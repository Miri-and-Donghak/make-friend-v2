package com.miri_and_donghak.makefriend.domain.entity.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public enum Hairstyle {
    BOMB_STYLE("bomb");

    private String name;

    Hairstyle(String name){
        this.name = name;
    }
}