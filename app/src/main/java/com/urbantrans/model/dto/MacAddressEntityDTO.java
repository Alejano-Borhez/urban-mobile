package com.urbantrans.model.dto;

import com.urbantrans.model.entity.EntityType;
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
public class MacAddressEntityDTO implements UrbanEntity<Long> {
    private Long id;
    private String macAddress;
    private UUID entityId;
    private EntityType entityType;
}
