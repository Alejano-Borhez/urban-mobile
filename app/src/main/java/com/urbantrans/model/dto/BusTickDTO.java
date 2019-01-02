package com.urbantrans.model.dto;

import com.urbantrans.model.Position;
import com.urbantrans.model.entity.UrbanEntity;
import com.urbantrans.model.entity.UrbanTick;

import java.time.LocalDateTime;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BusTickDTO implements UrbanEntity<Long>, UrbanTick {
    private Long id;
    private UUID routeId;
    private UUID busId;
    private LocalDateTime timeStamp;
    private Double gpsLatitude;
    private Double gpsLongitude;

    @Override
    public Position getPosition() {
        return Position.builder()
                .gpsLatitude(gpsLatitude)
                .gpsLongitude(gpsLongitude)
                .timeStamp(timeStamp)
                .build();
    }

    @Override
    public void setPosition(Position position) {
        this.gpsLatitude = position.getGpsLatitude();
        this.gpsLongitude = position.getGpsLongitude();
        this.timeStamp = position.getTimeStamp();
    }
}
