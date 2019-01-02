package com.urbantrans.model.dto.image;

import com.urbantrans.model.dto.BillDTO;
import com.urbantrans.model.entity.UrbanEntity;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BillImageDTO implements UrbanEntity<Long> {
    private Long id;
    private List<BillDTO> latestBills;
    private Integer totalRoutes;
    private Integer totalBuses;
    private Integer totalPassengers;
    private Double totalMileage;
    private Double totalAmount;
}