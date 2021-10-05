    package com.company;

        public class CrocodileLeatherSalon extends Decorator {//layer

        CrocodileLeatherSalon(CarCreation car) {
            super(car);
            System.out.println("Crocodile leather salon was equipped");
        }

        @Override
        public double takePrice() {
            return super.takePrice()+5878;//2.5kk tenge
        }

        @Override
        public String takeAllInfo() {
            return super.takeAllInfo()+"Salon:Crocodile Leather\n";
        }


    }