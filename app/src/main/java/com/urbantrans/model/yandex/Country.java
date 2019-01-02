package com.urbantrans.model.yandex;

import java.util.Collection;

import lombok.Data;

@Data
public class Country {
    private String title;
    private Code codes;
    private Collection<Region> regions;
}
