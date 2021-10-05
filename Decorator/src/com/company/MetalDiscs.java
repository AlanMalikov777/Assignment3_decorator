package com.company;

public class MetalDiscs extends Decorator {//layer

    MetalDiscs(CarCreation car) {
        super(car);
    }

    @Override
    public double takePrice() {
        return super.takePrice();
    }

    @Override
    public String takeAllInfo() {
        return super.takeAllInfo()+"Discs:Metal\n";
    }


}