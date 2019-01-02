package com.urbantrans.model.dto.image;

import com.urbantrans.model.dto.BusStopDTO;
import com.urbantrans.model.image.BusImage;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RideImageDTO {
    private List<BusImage> nearestBuses;
    private List<BusImage> upcomingBuses;
    private List<BusStopDTO> nearestBusStops;
    private List<BusStopDTO> matchedBusStops;
}
