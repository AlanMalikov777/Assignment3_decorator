    package com.company;

    public class CustomDisplay extends Decorator {//layer

        CustomDisplay(CarCreation car) {
            super(car);
        }

        @Override
        public double takePrice() {
            return super.takePrice();
        }

        @Override
        public String takeAllInfo() {
            return super.takeAllInfo()+"Display:Original\n";
        }


    }
