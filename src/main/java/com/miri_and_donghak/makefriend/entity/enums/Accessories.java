package com.miri_and_donghak.makefriend.entity.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public enum Accessories {
    HAT("accessories_cap"),
    GLASSES("accessories_glasses"),
    CHICKEN("accessories_chicken"),
    POOP("accessories_poop"),
    RIBBON("accessories_ribbon");

    private String name;

    Accessories(String name){
        this.name = name;
    }
}