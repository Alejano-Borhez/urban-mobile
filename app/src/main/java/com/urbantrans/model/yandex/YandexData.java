package com.urbantrans.model.yandex;

import java.util.Collection;

import lombok.Data;

@Data
public class YandexData {

    private Collection<Country> countries;

    public YandexData() {
    }

    public YandexData(Collection<Country> countries) {
        this.countries = countries;
    }

   /* public enum StationType {
        airport, bus_stop, bus_station, train_station, station, stop, platform
    }

    public enum TransportType {
        plane("самолет"),
        train("поезд"),
        suburban("электричка"),
        bus("автобус"),
        water("морской транспорт"),
        helicopter("вертолет");

        private String description;

        TransportType(String description) {
            this.description = description;
        }
    }*/
}
