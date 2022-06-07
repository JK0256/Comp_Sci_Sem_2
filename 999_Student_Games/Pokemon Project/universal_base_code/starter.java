import pkg.*;
import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.TimeUnit;


class starter {
	
	public static void waiting(int num) {	//(Only) use for METHODS
		try {
			TimeUnit.MILLISECONDS.sleep(num);
		}
		catch (Exception e) {
				
		}
	}
	
	public static void print(String output) {
		for (int i = 0; i<output.length(); i++) {
			char c = output.charAt(i);
			System.out.print(c);
			waiting(1);		//30
	    }
	}
	public static void println(String output) {
		for (int i = 0; i<output.length(); i++) {
			char c = output.charAt(i);
			System.out.print(c);
			waiting(1);		//30
	    }
	    System.out.println();
	    waiting(1);		//500
	}
	
	public static void hold(int num) {		//(Only) use for MAIN
		try {
			TimeUnit.SECONDS.sleep(num);
		}
		catch (Exception e) {
			
		}
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		println("Hello! I'm Professor Java!");
		println("Welcome to my Pokemon spin-off, Pokemon... Hm.");
		print("...");
		hold(1);
		println("I can't think of a good name.");
		println("How about you give the game a name?");
		print("Pokemon ");
		String gameName = sc.nextLine();
		println("Alright! Welcome to Pokemon " + gameName + "!");
		print("And while we're at it... what's your name? ");
		String playerName = sc.nextLine();
		println(playerName + ", is it?");
		print("Also, what's your rival's name? ");
		String rivalName = sc.nextLine();	//Rival's name
		String rMom = (rivalName + "'s Mom");	//Rival's Mom's name
		println("Is that so? Then you and " + rivalName + " have fun!");
		println("Now, get ready to explore the wild world of Pokemon!");
		println("\n...\n");
		hold(1);
		println("Rumble... rumble... The truck comes to a stop. ");
		println("Mom: " + playerName + ", we've arrived!");
		println("You step out of the truck. \nNew town: JavaTea Town\n");
		boolean javaTown = true;
		boolean choose = true;
		int home = 0;
		int neighbor = 0;
		int lab = 0;
		Pokemon starter = new Pokemon("");
		while(javaTown){
			println("Where would you like to visit?");
			println("House, Rival, or Professor?");
			if (sc.nextLine().equals("House")){
				if(home==0){
					println("You step into your house. A burly pokemon is moving boxes.");
					println("Mom: " + playerName + ", do you like your new home?");
					println("Mom: These mover Pokemon are really convenient, aren't they?");
					println("Mom: In the meanwhile, how about you visit the rest of the town?");
					home = 1;
				}
				else if(home==1){
					println("Mom: I can't coddle you forever. Go visit the rest of the town.");
				}
				else if(home==2){
					println("Mom: Hello " + playerName + ", would you and your pokemon like to take a rest?");
					println("You close your eyes, taking a deep rest.");
					//Pokemon health is fully restored
					println("Mom: Alright, good luck on your adventures!");
				}
			}
			else if (sc.nextLine().equals("Rival")){
				if(neighbor==0){
					println("You step into " + rivalName + "'s house.");
					println(rMom + ": Hello there, " + playerName + "!");
					println(rMom + ": " + rivalName + " has been waiting for you!");
					println("On cue, a boy comes down from upstairs.");
					println(rivalName + ": Hey there, " + playerName + "!");
					println(rivalName + ": Did you come here to become a pokemon trainer as well?");
					println(rivalName + ": Well, I'll become one first!");
					println(rivalName + " rushes out of the house.");
					println(rMom + ": Oh geez, there he goes again.");
					println(rMom + ": Well, what are you waiting for?");
					println(rMom + ": He'll be at the Professor's lab.");
					neighbor = 1;
				}
				else if (neighbor==1){		//After coming once
					println(rMom + ": You're back?");
					println(rMom + ": Well, as I said, he'll be at the Professor's lab.");
				}
				else if (neighbor==2){		//After encounter at lab
					println(rMom + ": Hello " + playerName + ", " + rivalName + " isn't home now.");
					println(rMom + ": Maybe come back another time?");
				}
			}
			else if (sc.nextLine().equals("Professor")){
				if(lab==0){
					println(rivalName + ": Hey " + playerName + ", what took you so long?");
					println("Profesor: Hello " + playerName + ", are you here to get your Pokemon?");
					println("Profesor: As you can see, " + rivalName + " wanted to get his Pokemon first, but I had him wait for you.");
					println(rivalName + ": Wait... actually, I'd like " + playerName + " to get his starter first.");
					println("Profesor: Really? Well then, " + playerName + ", choose first!");
					while(choose){
						println("Which starter would you like to choose? 1, 2, or 3?");
						println("1: Bulbasaur, the Grass type");
						println("2: Squirtle, the Water type");
						println("3: Charmander, the Fire type");
						int choice = sc.nextInt();
						if(choice==1||choice==2||choice==3){
							if(choice==1){
								println("Will you choose Bulbasaur, the Grass type? y/n");
								starter.setName("Bulbasaur");
							}
							else if(choice==2){
								println("Will you choose Squirtle, the Water type? y/n");
								starter.setName("Squirtle");
							}
							else if(choice==3){
								println("Will you choose Charmander, the Fire type? y/n");
								starter.setName("Charmander");
							}
							boolean confirmBool = true;
							while(confirmBool){
								if(sc.nextLine().equals("y")){
									println("Congratulations, you've picked " + starter + "!");
									choose = false;
								}
								else{
									confirmBool = false;
								}
							}
						}
					}
					println("Profesor: Your starter will stay with you for the rest of your journey,\nand probably become you best friend.");
					println("Profesor: What would you like to name it?");
					println("Enter a name for your " + starter + ": ");
					
					
					println(rivalName + ": Wait... actually, I'd like " + playerName + " to get his starter first.");
				}
				else if(lab==1){
					
				}
			}
		}
		//Next Town
		
	}
}
