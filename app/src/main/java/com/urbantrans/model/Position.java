package com.urbantrans.model;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Represents 3-dimensional coordinates of any object:
 * 2 dimensions are for gps_lat & gps_long
 * 1 dimension is for timestamp
 * Created by alexander_borohov on 21.9.17.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Position {
    private Double gpsLatitude;
    private Double gpsLongitude;
    private LocalDateTime timeStamp;
}