package com.urbantrans.model.image;

import com.urbantrans.model.Position;
import com.urbantrans.model.dto.BusDTO;
import com.urbantrans.model.dto.RouteDTO;
import com.urbantrans.model.entity.UrbanEntity;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(exclude = {"startPosition", "currentPosition", "mileage", "revenue", "passengersCount", "passengersOnBoard"})
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BusImage implements UrbanEntity<Long> {
    private Long id;
    private BusDTO bus;
    private RouteDTO route;
    private Position startPosition;
    private Position currentPosition;
    private Double mileage;
    private BigDecimal revenue;
    /**
     * Represents current number of passengers on board
     */
    private Integer passengersOnBoard;
    /**
     * Represents total number of passengers carried
     */
    private Integer passengersCount;
}