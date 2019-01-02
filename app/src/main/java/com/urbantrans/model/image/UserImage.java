package com.urbantrans.model.image;

import com.urbantrans.model.Position;
import com.urbantrans.model.dto.BusDTO;
import com.urbantrans.model.dto.RouteDTO;
import com.urbantrans.model.dto.UserDTO;
import com.urbantrans.model.entity.UrbanEntity;

import java.time.LocalTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserImage implements UrbanEntity<Long> {
    private Long id;
    private UserDTO user;
    private BusDTO bus;
    private RouteDTO route;
    private Position startPosition;
    private Position currentPosition;
    private int absenceCount;
    private Double mileage;
    private LocalTime timeOnBoard;
}
