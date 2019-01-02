package com.urbantrans.model.view;

import com.urbantrans.model.dto.BusStopDTO;
import com.urbantrans.model.entity.TransportType;

import java.util.List;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RouteView {
    private UUID id;
    private String name;
    private TransportType transportType;
    private List<BusStopDTO> busStops;
}
