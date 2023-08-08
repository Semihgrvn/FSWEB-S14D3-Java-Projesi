package com.workintech.polymorphism.company;

import com.workintech.polymorphism.skeleton.CarSkeleton;

public class ElectricCar extends CarSkeleton {

    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String name, String description,double avgKmPerCharge,int batterySize) {
        super(name, description);
        this.avgKmPerCharge=avgKmPerCharge;
        this.batterySize=batterySize;
    }

}
