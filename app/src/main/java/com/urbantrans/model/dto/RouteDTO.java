package com.urbantrans.model.dto;

import com.urbantrans.model.entity.TransportType;
import com.urbantrans.model.entity.UrbanEntity;

import java.util.Set;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RouteDTO implements UrbanEntity<UUID> {
    private UUID id;
    private String description;
    private Set<UUID> busStopIds;
    private TransportType transportType;
}