package com.urbantrans.model.dto.image;

import com.urbantrans.model.Position;
import com.urbantrans.model.dto.BusDTO;
import com.urbantrans.model.entity.UrbanEntity;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BusImageDTO implements UrbanEntity<Long> {
    private Long id;
    private BusDTO bus;
    private UUID routeId;
    private Integer passengersCount;
    private Position currentPosition;
}