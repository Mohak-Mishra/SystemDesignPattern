package com.mishra.mohak.builderDesignPattern;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class House {
    private Integer windows;
    private Boolean swimmingPool;
    private Integer parking;
    private Integer rooms;
    private Integer restRooms;

}