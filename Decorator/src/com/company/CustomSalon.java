package com.company;

    public class CustomSalon extends Decorator {//layer

    public CustomSalon(CarCreation car) {
        super(car);
    }

    @Override
    public double takePrice() {
        return super.takePrice();
    }

    @Override
    public String takeAllInfo() {
        return super.takeAllInfo()+"Salon:Custom\n";
    }


}