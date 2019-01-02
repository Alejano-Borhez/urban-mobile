package com.urbantrans.model.wrapper;

import com.urbantrans.model.Position;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RideRequestWrapper {
    private List<String> macAddresses;
    private Position currentPosition;
}
