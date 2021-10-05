package com.company;

public class SteelDiscs extends Decorator {//layer

    SteelDiscs(CarCreation car) {
        super(car);
        System.out.println("Steel discs was equipped");
    }

    @Override
    public double takePrice() {
        return super.takePrice()+4700;//2kk tenge
    }

    @Override
    public String takeAllInfo() {
        return super.takeAllInfo()+"Discs:Steel\n";
    }


}
