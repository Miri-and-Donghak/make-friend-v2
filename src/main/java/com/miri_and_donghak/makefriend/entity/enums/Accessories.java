package com.miri_and_donghak.makefriend.entity.enums;

import lombok.Getter;

public enum Accessories {
    ACCESSORIES_CAP("accessories_cap"),
    ACCESSORIES_GLASSES("accessories_glasses"),
    ACCESSORIES_CHICKEN("accessories_chicken"),
    ACCESSORIES_POOP("accessories_poop"),
    ACCESSORIES_RIBBON("accessories_ribbon");

    private String name;

    Accessories(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}