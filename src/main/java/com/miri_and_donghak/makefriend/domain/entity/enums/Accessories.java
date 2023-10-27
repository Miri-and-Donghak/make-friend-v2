package com.miri_and_donghak.makefriend.domain.entity.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public enum Accessories {
    HAT("hat"),
    SUNGLASSES("sunglasses"),
    PIN("hairpin"),
    FOOD("chicken"),
    POOP("poop");

    private String name;

    Accessories(String name){
        this.name = name;
    }
}
