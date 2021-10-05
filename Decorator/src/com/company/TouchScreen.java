package com.company;

public class TouchScreen extends Decorator {//layer

    TouchScreen(CarCreation car) {
        super(car);
        System.out.println("Touch-screen was equipped");
    }

    @Override
    public double takePrice() {
        return super.takePrice()+3525;//1.5kk tenge
    }

    @Override
    public String takeAllInfo() {
        return super.takeAllInfo()+"Display:Touch-Screen\n";
    }


}
