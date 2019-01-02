package com.urbantrans.model.dto;

import com.urbantrans.model.Position;
import com.urbantrans.model.entity.UrbanEntity;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserTickDTO implements UrbanEntity<Long> {
    private Long id;
    private UUID userId;
    private UUID busId;
    private UUID routeId;
    private UUID busStopId;
    private Position currentPosition;
}
