package co.grandcircus;

import java.util.Random;

public class BubbaJones extends Player {



	public BubbaJones(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Roshambo generateRoshambo() {
		// TODO Auto-generated method stub
		Roshambo choice;
		int random = (int)(Math.random() * 3 + 1);
		if(random == 1) {
			 choice =Roshambo.ROCK;	
		}else if(random==2) {
			choice = Roshambo.PAPER;
		}else {
			choice = Roshambo.SCISSORS;
		}return choice;
	}


	

}
