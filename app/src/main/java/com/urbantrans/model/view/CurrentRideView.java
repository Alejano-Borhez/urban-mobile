package com.urbantrans.model.view;

import com.urbantrans.model.Position;
import com.urbantrans.model.dto.BusDTO;
import com.urbantrans.model.dto.BusStopDTO;
import com.urbantrans.model.dto.UserDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CurrentRideView {
    private UserDTO user;
    private BusDTO bus;
    private RouteView route;
    private BusStopDTO busStopBegin;
    private Position positionBegin;
    private Position currentPosition;
}
