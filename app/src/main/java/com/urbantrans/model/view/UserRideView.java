package com.urbantrans.model.view;

import com.urbantrans.model.dto.UserDTO;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserRideView {
    private UserDTO user;
    private List<CurrentRideView> currentRides;
    private List<LatestBillView> latestBills;
}
