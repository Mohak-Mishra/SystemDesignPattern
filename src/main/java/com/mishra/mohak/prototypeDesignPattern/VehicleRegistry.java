package com.mishra.mohak.prototypeDesignPattern;

import java.util.HashMap;

public class VehicleRegistry {
    private static HashMap<String, Vehicle> map = new HashMap<String, Vehicle>();
    static {
        map.put("two",new TwoWheelerVehicle("500",false,"Royal",200000L));
        map.put("four",new FourWheelerVehicle("2500","BMW",10000000L,true,false));
    }
    public static Vehicle getVehicle(String vehicle) throws CloneNotSupportedException {
        return map.get(vehicle).clone();
    }
}
