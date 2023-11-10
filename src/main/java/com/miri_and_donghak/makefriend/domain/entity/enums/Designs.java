package com.miri_and_donghak.makefriend.domain.entity.enums;

import com.miri_and_donghak.makefriend.domain.entity.enums.Accessories;
import com.miri_and_donghak.makefriend.domain.entity.enums.Hairstyle;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;

@Getter
@Embeddable
@AllArgsConstructor
public class Designs {
    private ArrayList<Accessories> accessories;

    private Hairstyle hairstyle;

    public Designs() {}
}
