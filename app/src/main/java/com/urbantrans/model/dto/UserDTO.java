package com.urbantrans.model.dto;

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
public class UserDTO implements UrbanEntity<UUID> {
    private UUID id;
    private String userName;
}
