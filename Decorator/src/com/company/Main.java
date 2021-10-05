package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {//our program that gives a client to choose a 4 different cases of equipments to a Toyota Camry Car
    	System.out.println("Hello, dear guest. Let's take a equipment for the Toyota Camry 50 of 2021 year\n");
		System.out.println("Our equipments:\n"+"1.Custom\n"+"2.Middle\n"+"3.Junior Suit\n"+"4.Suit\n"+"5.Exit");
		Scanner sc=new Scanner(System.in);
		System.out.print("Your choice(choose between 1-5 only):");
		int number= sc.nextInt();
		System.out.println();
		switch (number){
			case 1:
				System.out.println("Custom equipment");
				CarCreation camryCustom = new CustomDisplay(new MetalDiscs(new CustomSalon(new CarCamry())));//adding layers
				System.out.println("Total cost:" + camryCustom.takePrice()+" USD");
				System.out.println("Information:");
				System.out.println(camryCustom.takeAllInfo());
				break;
			case 2:
				System.out.println("Middle equipment");
				CarCreation camryMiddle = new CustomDisplay(new SteelDiscs(new LeatherSalon(new CarCamry())));
				System.out.println("Total cost:" + camryMiddle.takePrice()+" USD");
				System.out.println("Information:");
				System.out.println(camryMiddle.takeAllInfo());
				break;
			case 3:
				System.out.println("Junior Suit equipment");
				CarCreation camryJuniorSuit = new TouchScreen(new SteelDiscs(new LeatherSalon(new CarCamry())));
				System.out.println("Total cost:" + camryJuniorSuit.takePrice()+" USD");
				System.out.println("Information:");
				System.out.println(camryJuniorSuit.takeAllInfo());
				break;
			case 4:
				System.out.println("Suit equipment");
				CarCreation camrySuit = new TouchScreen(new TitanDiscs(new CrocodileLeatherSalon(new CarCamry())));
				System.out.println("Total cost:" + camrySuit.takePrice()+" USD");
				System.out.println("Information:");
				System.out.println(camrySuit.takeAllInfo());
				break;
			case 5:
				System.out.println("Bye!!!");
				return;
			default:
				System.out.println("Please renew this program and write only numbers between 1-5");
		}
    }
}
