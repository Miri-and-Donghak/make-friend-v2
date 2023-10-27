package com.miri_and_donghak.makefriend.domain.entity.dto;

import com.miri_and_donghak.makefriend.domain.entity.enums.Accessories;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;

@Getter
@AllArgsConstructor
public class SaveCharcterRequest {
    private String name;
    private String description;
    private ArrayList<Accessories> accessories;
}
