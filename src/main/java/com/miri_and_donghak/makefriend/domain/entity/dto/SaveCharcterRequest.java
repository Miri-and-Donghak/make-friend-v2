package com.miri_and_donghak.makefriend.domain.entity.dto;

import com.miri_and_donghak.makefriend.domain.entity.enums.Accessories;
import com.miri_and_donghak.makefriend.domain.entity.enums.Hairstyle;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;

@AllArgsConstructor
public class SaveCharcterRequest {
    private String name;
    private String description;
    private ArrayList<Accessories> accessories;
    private Hairstyle hairstyle;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public ArrayList<Accessories> getAccessories() {
        return accessories;
    }

    public Hairstyle getHairstyle() {
        return hairstyle;
    }
}
