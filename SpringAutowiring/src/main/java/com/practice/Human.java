package com.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	
	@Autowired
	@Qualifier("humanHeart")
	private Heart heart;
	
	/*
	 * public Human() { System.out.println("default constructor called"); }
	 * 
	 * public Human(Heart heart) {
	 * 
	 * super(); System.out.println("human constructor called"); this.heart = heart;
	 * }
	 * 
	 * public void setHeart(Heart heart) { this.heart = heart;
	 * System.out.println("Setter method called"); }
	 */
	public void startPump() {
		if(heart != null) 
		{
		heart.pump();
		System.out.println("name of animal is: "+ heart.getNameOfAnimal()+" ,no. of hearts are: "+ heart.getNoOfHeart());
		}
		else {
			System.out.println("Your are not alive");
		}
	}
}
