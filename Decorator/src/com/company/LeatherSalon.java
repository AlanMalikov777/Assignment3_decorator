package com.company;

public class LeatherSalon extends Decorator {

    public LeatherSalon(CarCreation car) {
        super(car);
        System.out.println("Leather salon was equipped");
    }

    @Override
    public double takePrice() {
        return super.takePrice()+2355;//1kk tenge
    }

    @Override
    public String takeAllInfo() {
        return super.takeAllInfo()+"Salon:Leather\n";
    }


}
