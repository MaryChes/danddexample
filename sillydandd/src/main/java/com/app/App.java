package com.app;

import java.util.Scanner;

import com.ourcharacters.ElfJedi;
import com.ourcharacters.HumanWizard;
import com.parents.*;
import com.interfaces.*;

public class App {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean userInputCorrect = false;
		ElfJedi ej = new ElfJedi();
		
		
		
		
		
		do {
			
			System.out.println("Welcome to Silly D'n'D\n" 
					+ "Would you like to play as a(n)\n" 
					+ "1. Human Wizard\n"
					+ "2. Elf Royal\n" 
					+ "3. Twi'lek Jedi\n" 
					+ "4. Smurf Warrior\n" 
					+ "5. Turtle Ninja");
			String userInput = sc.nextLine();
			switch (userInput) {
			case "1":
				HumanWizard hw = HumanWizard.makeHumanWizard();
				System.out.println(hw.getHealth());
				System.out.println(hw.getMagic());
				System.out.println(hw.getName());
				System.out.println(hw.getWeapon());
				break;
			case "2":
				//Call to elfRoyal methods here
				break;
			case "3":
				//Call to twilekJedi methods here
				break;
			case "4":
				//Call to smurfWarrior methods here
				break;
			case "5":
				//Call to turtleNinja methods here
				break;
			default:
				userInputCorrect = true;
				System.out.println();
				System.out.println("You've entered an invalid choice. \n"
						+ "Please select 1,2,3,4,5");
				System.out.println();
				break;
			}
		} while (userInputCorrect);
		sc.close();
	}//end main

}
