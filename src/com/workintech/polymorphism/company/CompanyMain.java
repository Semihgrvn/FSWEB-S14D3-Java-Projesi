package com.workintech.polymorphism.company;

import com.workintech.polymorphism.skeleton.CarSkeleton;

public class CompanyMain {

    public static void main(String[] args) {
        CarSkeleton car1= new ElectricCar("Tesla", "Tesla aracıdır", 100, 10);
        car1.drive();
    }

}
