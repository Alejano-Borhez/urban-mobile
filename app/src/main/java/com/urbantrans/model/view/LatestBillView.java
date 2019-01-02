package com.urbantrans.model.view;

import com.urbantrans.model.dto.BillDTO;
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
public class LatestBillView {
    private BillDTO bill;
    private UserDTO user;
    private BusDTO bus;
    private RouteView route;
    private BusStopDTO busStopBegin;
    private BusStopDTO busStopEnd;
}
