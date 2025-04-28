package com.mishra.mohak.prototypeDesignPattern;

public class FourWheelerVehicle extends Vehicle  {
    private Boolean automatic;
    private Boolean isDiesel;
    public FourWheelerVehicle(String engine, String model, Long price, Boolean automatic, Boolean isDiesel) {
        super(engine, model, price);
       this.automatic = automatic;
       this.isDiesel = isDiesel;
    }
    protected FourWheelerVehicle clone() throws CloneNotSupportedException {
        return (FourWheelerVehicle) super.clone();
    }
}