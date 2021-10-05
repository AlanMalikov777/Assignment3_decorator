package com.company;

public class TitanDiscs  extends Decorator {//layer

    TitanDiscs(CarCreation car) {
        super(car);
        System.out.println("Titan discs was equipped");
    }

    @Override
    public double takePrice() {
        return super.takePrice()+9405;//4kk tenge
    }

    @Override
    public String takeAllInfo() {
        return super.takeAllInfo()+"Discs:Titan\n";
    }


}
