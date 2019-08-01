package co.grandcircus;

import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		boolean cont = true;
		
		
		System.out.println("Welcome to rock paper scissors");
		
		// user name for player
		String userName = Validator.getString(scan, "Enter User Name");
		int opponenet = Validator.getInt(scan, "select opponenet (1- RockyB, 2- BubbaJones): ");
		PlayerOne playa = new PlayerOne(userName);
		
		Player opp = null;
		
		// select opponent 
		if(opponenet ==1) {
			opp= new RockyB(userName);
		}else if(opponenet == 2) {
			opp = new BubbaJones(userName);
		}
		// prompt user for rock paper scissors
		int choice = Validator.getInt(scan, "Select (1- rock, 2- Scissors, 3- Paper: ");
		Roshambo rosh = null;
		if(choice ==1) {
		rosh = Roshambo.ROCK;
		}else if(choice ==2){
			rosh = Roshambo.SCISSORS;
		}else if(choice ==3) {
			rosh = Roshambo.PAPER;}
		
		
		
		// play match
	int x=0;
	int y=0;
		if(opponenet==1) {
			if(rosh == opp.generateRoshambo()) {
				System.out.println("Tie");
			}else if(rosh == Roshambo.PAPER) {
				System.out.println("You Win!");
				x++;
			}else if(rosh == Roshambo.SCISSORS) {
				System.out.println("You lose");
				y++;	
		}
		}
		Roshambo oppo = null;
		if(choice ==1) {
			oppo = Roshambo.ROCK;
			}else if(choice ==2){
				oppo = Roshambo.ROCK;
			}else if(choice ==3) {
				oppo = Roshambo.ROCK;}
		System.out.println("you chose "+rosh+ " V.S. "+ oppo);
			
		
		
		
		
		
		
		

		
		
		//outcome // and game
		
		
		
		
		
		
		
		
		// score
		
		
		
		// end of loop
		System.out.println("Would you like to keep playing");
		String leave =scan.nextLine();
		if(leave.equalsIgnoreCase("no")) {
			cont = false;
		}
		scan.close();
		}
		
		
	}


