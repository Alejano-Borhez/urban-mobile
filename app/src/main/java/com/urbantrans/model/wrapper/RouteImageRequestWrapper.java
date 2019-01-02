package com.urbantrans.model.wrapper;

import com.urbantrans.model.image.RouteImage;

import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RouteImageRequestWrapper {
    private RouteImage entity;
    private Map<String, Boolean> sortCriteria;
    private Integer limit;
    private Integer offset;
}
