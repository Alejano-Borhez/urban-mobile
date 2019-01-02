package com.urbantrans.model.dto;

import com.urbantrans.model.entity.UrbanEntity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BillDTO implements UrbanEntity<Long> {
    private Long id;
    private LocalDateTime timeStamp;
    private UUID userId;
    private UUID busId;
    private UUID busStopBeginId;
    private LocalDateTime getInTime;
    private UUID busStopEndId;
    private LocalDateTime getOutTime;
    private UUID routeId;
    private BigDecimal amount;
    private Double mileage;
}