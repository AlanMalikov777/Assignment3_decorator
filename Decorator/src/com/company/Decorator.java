package com.company;

public abstract class Decorator implements CarCreation{//structural pattern allows you to add new behaviors by using layers
        CarCreation car;
        Decorator(CarCreation car){
            this.car=car;
        }


    public double takePrice() {
        return car.takePrice();
    }


    public String takeAllInfo() {
        return car.takeAllInfo();
    }

}
