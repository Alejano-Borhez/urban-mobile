package com.urbantrans.model.yandex;

import lombok.Data;

@Data
public class Station {
    private String title;
    private String direction;
    private String station_type;
    private String transport_type;
    private Code codes;
    private Double longitude;
    private Double latitude;
}