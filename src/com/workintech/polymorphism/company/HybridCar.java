package com.workintech.polymorphism.company;

import com.workintech.polymorphism.skeleton.CarSkeleton;

public class HybridCar extends CarSkeleton {

    private double avgKmPerCharge;
    private int batterySize;
    private int cylinders;

    public HybridCar(String name, String description,double avgKmPerCharge,int batterySize,int cylinders) {
        super(name, description);
        this.avgKmPerCharge=avgKmPerCharge;
        this.batterySize=batterySize;
        this.cylinders=cylinders;
    }
}
