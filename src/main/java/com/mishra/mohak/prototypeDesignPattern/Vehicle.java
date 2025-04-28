package com.mishra.mohak.prototypeDesignPattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Vehicle implements Cloneable {
        private String engine;
        private String model;
        private Long price;


        protected Vehicle clone() throws CloneNotSupportedException {
            return (Vehicle) super.clone();
        }
}