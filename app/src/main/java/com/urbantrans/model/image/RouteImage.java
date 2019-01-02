package com.urbantrans.model.image;

import com.urbantrans.model.dto.RouteDTO;
import com.urbantrans.model.entity.UrbanEntity;

import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RouteImage implements UrbanEntity<Long> {
    private Long id;
    private RouteDTO route;
    private Set<BusImage> busImages;
    private Double totalMileage;
    private Double totalAmount;
    private Integer totalBusesOnRoute;
    private Integer totalPassengersOnBoard;
    private Integer totalPassengersCarried;
}
