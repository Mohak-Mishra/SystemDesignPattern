package com.mishra.mohak.prototypeDesignPattern;


public class TwoWheelerVehicle extends Vehicle  {

    private Boolean isElectric;

    public TwoWheelerVehicle(String engine, Boolean isElectric, String model, Long price) {
        super(engine, model, price);
        this.isElectric = isElectric;
    }

    protected TwoWheelerVehicle clone() throws CloneNotSupportedException {
        return (TwoWheelerVehicle) super.clone();
    }

}