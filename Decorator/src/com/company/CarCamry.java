    package com.company;

    public class CarCamry implements CarCreation{//It is basis and when new equipments will be added it will accept new values in methods
        @Override
        public double takePrice() {
            return 28290;//12kk tenge
        }

        @Override
        public String takeAllInfo() {
            return "Toyota Camry\nModel:50\nYear:2021\n";
        }
    }
