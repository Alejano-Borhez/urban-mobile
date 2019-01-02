package com.urbantrans.model.yandex;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Rectangle {
    private double longitudeLeftTop;
    private double longitudeRightTop;
    private double longitudeLeftBottom;
    private double longitudeRightBottom;
    private double latitudeLeftTop;
    private double latitudeRightTop;
    private double latitudeLeftBottom;
    private double latitudeRightBottom;
}
