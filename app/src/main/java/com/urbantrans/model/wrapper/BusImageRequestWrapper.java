package com.urbantrans.model.wrapper;

import com.urbantrans.model.image.BusImage;

import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BusImageRequestWrapper {
    private BusImage entity;
    private Map<String, Boolean> sortCriteria;
    private Integer limit;
    private Integer offset;
}
