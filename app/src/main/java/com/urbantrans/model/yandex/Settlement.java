package com.urbantrans.model.yandex;

import java.util.Collection;

import lombok.Data;

@Data
public class Settlement {
    private String title;
    private Code codes;
    private Collection<Station> stations;
}
