import java.util.Scanner;

public class Application {
	private static Scanner scanner = new Scanner( System.in );
	private static String myName;
	private static String crush;
	
	public static void main(final String[]args) {
		while(true) {
			System.out.println("Hello! What is your lovely name?");
			myName = scanner.nextLine();
			System.out.println("Hi " + myName + " !");
			System.out.println("Are you in love? (Yes/No)");
			String answer = scanner.nextLine(); 
			if (answer.equalsIgnoreCase("Yes")) {		    	
		    	Surveillance();	
		    	LoveLetter();
		    	BlackjackRunner();
		    	break;
		    } else if (answer.equalsIgnoreCase("No")) {
		    	System.out.println("What a bummer :( why are you even using this program??? Come back when you find someone ;)");  	
		    } else {
		    	 System.out.println("Come on! It's a yes or no question!!");
		    }	
		}
	}
	
	
	public static void Surveillance() {
		
		//first question
		System.out.println("Who is this special one?");
		crush = scanner.nextLine();		
			
		//second question
		System.out.println("On a scale of 1 to 5, how much do you like " + crush + "?");
		
		int crushlevel = scanner.nextInt();
		
		if (crushlevel < 3) {
			System.out.println("NAHHHH YOU DON'T EVEN LIKE " + crush + " THAT MUCH GO BACK AND FIND SOMEONE ELSE!! :(((");
		} else if (crushlevel > 5 || crushlevel < 1) {
			System.out.println("What are you doing?! Gimme some valid numbers!");
		} else {
			System.out.println("Try this out on the next conversation with " + crush + "!");
			scanner.nextLine();
			scanner.nextLine();
			int number = (int)(10 * Math.random());
			if (number == 0) {
				System.out.println("You must be very fit! Because you've been running through my mind all day :)");
			}
			if (number == 1) {
				System.out.println("Are you a camera? Because everytime I look at you, I smile :)");
			}
			if (number == 2) {
				System.out.println("You are like a dictionary, because you add meaning to my life :)");
			}
			if (number == 3) {
				System.out.println("Were your parents greek gods? Because it takes two to make a goddess :)");
			}
			if (number == 4) {
				System.out.println("Excuse me, I think you have something in your eye. Oh never mind, it's just a sparkle :)");
			}
			if (number == 5) {
				System.out.println("Most people like to watch the Olympics, because it only happens once every four years, but I'd rather"
						+ "talk to you cause the chance of meeting someone so special only happens once in a lifetime :)");
			}
			if (number == 6) {
				System.out.println("Is your name Google? Because you are everything I've been searching for :)");
			}
			if (number == 7) {
				System.out.println("You wanna know what is beautiful? Read the first word again :)");
			}
			if (number == 8) {
				System.out.println("I thought happiness started with an H, but how come mine started with you? :)");
			}
			if (number == 9) {
				System.out.println("Do you have a map? Because I'm getting lost in your eyes :)");
			}
		}		
		
		System.out.println("Clever, right?");
		
		scanner.nextLine();
		//third question
		System.out.println("So now that you've used the pickup line~~ DO SOMETHING!!! Take " + crush + " out!!!!");
		
		System.out.println("On a scale of 1 to 10, how ready are you to take " + crush + "'s arm and go??");
		int readiness = scanner.nextInt();
		if (readiness < 7) {
			System.out.println("Come on!! I see " + crush + " walking away with someone else??!?!?!??"
					+ " WHY YOU STILL STARIN'???? DO SOMETHING!!! TYPE A BIGGER NUMBER!! :(((");
		} else if (readiness > 10 || readiness < 1) {
			System.out.println("What are you doing?! Gimme some valid numbers!");
		} else {
		
			int location = (int)(10 * Math.random());
			if (location == 0) {
				System.out.println("Go to Grainger, have a study date. You an engnineer, Grainger is your home, take " + crush + " home :)");
			}
			if (location == 1) {
				System.out.println("Stay on the main quad and just chill, and daydream together :)");
			}
			if (location == 2) {
				System.out.println("Go to Morrow Plots and watch corn together :)");
			}
			if (location == 3) {
				System.out.println("Go to Teamoji...jk Latea is better, go to Latea and get some boba! If you do that, the programmer would be very happy :)");
			}
			if (location == 4) {
				System.out.println("Go get some muscles at ARC...the programmer would be very proud  :)");
			}
			if (location == 5) {
				System.out.println("Go to the armory and get lost together...HOW CUTEEEEEEE :)");
			}
			if (location == 6) {
				System.out.println("Go to Cafe Bene and get some dessert!! Trust me, you will not regret this :)");
			}
			if (location == 7) {
				System.out.println("COCOMERO?!!!! DUH!!!! FRO-YO, DATE??? COME ON LETS GOOOOOOOOOOOO :)");
			}
			if (location == 8) {
				System.out.println("Go near CRCE and have a romantic stroll by the lake :)");
			}
			if (location == 9) {
				System.out.println("Go behind the Engineering Hall and stare at the waterfall together :)");
			}			
		}
	}
	
	public static void LoveLetter() {
		scanner.nextLine();
		scanner.nextLine();
		System.out.println("hmm~~ Now that we all know your intentions, let's take that final step...TAKE IT HOME BABYYYYYYY");
		System.out.println("Now I'm gonna ask you a series of question, please answer them seriously...however you like them :)");
		System.out.println("Are you readyyyyy???????");
		scanner.nextLine();
		scanner.nextLine();
		System.out.println("Actually, your opinion doesn't matter so HERE WE GOOOO :)");
		System.out.println("What is one trait you love about " + crush + " ?");
		String trait1 = scanner.nextLine();
		System.out.println("What is another trait you love about " + crush + " ? C'mon there has to be more than one :)))");
		String trait2 = scanner.nextLine();
		System.out.println("What is one negative trait of yourself?");
		String negative1 = scanner.nextLine();
		System.out.println("What is another negative trait of yourself?");
		String negative2 = scanner.nextLine();
		System.out.println("Where did you first meet " + crush + " ?");
		String location = scanner.nextLine();
		System.out.println("What is a cute nickname you'd call " + crush + " by? Like 'teddybear' or 'bae'");
		String nickname1 = scanner.nextLine();
		System.out.println("What is a cuter nickname you'd call " + crush + " by?");
		String nickname2 = scanner.nextLine();
		System.out.println("What is the BAEst nickname you'd call " + crush + " by?");
		String nickname3 = scanner.nextLine();
		System.out.println("Congrats!!! You've just completed your SPICY~~ and mucho SAUCY~~ LUV LETTER!!!");
		System.out.println("So now is the big moment, the final reveal. This is the moment you've been working for!!");
		System.out.println("Are you ready to let the words flow through??");
		scanner.nextLine();
		System.out.println("JK YOUR OPINION NEVER MATTERS!! HEERRRREEEEE WEEEEE GOOOOOOOOO");
		scanner.nextLine();
		System.out.println("Hey " + crush + ", I have something I want to tell you");
		scanner.nextLine();
		System.out.println("From the moment I first laid eyes on you, your " + trait1 + " and " + trait2 +
				" personality just radiates through my entire body like a beacon of light in a world full of darkness.");
		scanner.nextLine();
		System.out.println("Your saintlike appearance could bring joy and happiness upon such a " + negative1 + 
				" and " + negative2 + " person like me.");
		scanner.nextLine();
		System.out.println("Ever since I saw you that time at " + location + ", I have decided to dedicate my entire life to making you, "
				+ "my " + nickname1 + ", my " + nickname2 + " happy forever.");
		scanner.nextLine();
		System.out.println("I just wanted you to be happy, my " + nickname3 + ", and I hope that fate will one day link us together.");
		scanner.nextLine();
		System.out.println("From the Bottom of My Heart,");
		scanner.nextLine();
		System.out.println(myName);
		scanner.nextLine();
		System.out.println("Great job, you did it!!");
		System.out.println("But, you know this all too well, love is not logical");
		System.out.println("Your love might say yes or might say no.");
		System.out.println("So here is a game of blackjack that will detemine what your crush will say");
		System.out.println("Enjoy!!");
	}
	
	public static void BlackjackRunner() {
		System.out.println("Welcome to Blackjack, do you feel lucky today???");
		System.out.println("You have 50 lover points, if you get above 100 points, your date will say yes; "
				+ "if you get below 0, your date will slap you in the face and run away");
		int loverPoints = 50;
		while(loverPoints > 0 && loverPoints < 100) {
			System.out.println("How much would you like to bet?");
			int bet = scanner.nextInt();
			if(bet > loverPoints || bet <= 0) {
				System.out.println("please bet what you have!!");
			}
			System.out.println("Dealing cards currently, be patient...");
			
			
			Deck playerDeck = new Deck();
			Deck drawingDeck = new Deck();
			Deck dealerDeck = new Deck();
			drawingDeck.createFullDeck();
			drawingDeck.shuffle();
			playerDeck.drawCard(drawingDeck);
			playerDeck.drawCard(drawingDeck);
			dealerDeck.drawCard(drawingDeck);
			dealerDeck.drawCard(drawingDeck);
			
			System.out.println("You draw:");
			playerDeck.showHand(playerDeck);
			
			System.out.println("dealer draws:");
			System.out.println(dealerDeck.getCard(0).toString());
			System.out.println("[hidden card]");
			
			boolean playerDone = false;
			boolean dealerDone = false;
			boolean playerExploded = false;
			boolean dealerExploded = false;
			while(!playerDone || !dealerDone) {
				if(!playerDone) {
					System.out.println("Your total is: " + playerDeck.gameScore());
					System.out.println("Do you want to hit(1) or stay(2)?");
					int response = scanner.nextInt();
					if(response == 1) {
						playerDeck.drawCard(drawingDeck);
						System.out.println(playerDeck.getCard(playerDeck.deckSize() - 1).toString());
						if(playerDeck.gameScore() > 21) {
							System.out.println("You exploded!!");
							playerDone = true;
							playerExploded = true;
							dealerDone = true;
						} else {
							System.out.println("Your total is now " + playerDeck.gameScore());
						}
					} else {
						playerDone = true;
					}
				}
				
				if(!dealerDone) {
					if(dealerDeck.gameScore() < 17) {
						System.out.println("dealer hits!!");
						dealerDeck.drawCard(drawingDeck);
						if(dealerDeck.gameScore() > 21) {
							System.out.println("Dealer exploded!!");
							dealerDone = true;
							dealerExploded = true;
							playerDone = true;
						}
					} else {
						System.out.println("dealer stays!!");
						dealerDone = true;
					}
				}
			}
			
			System.out.println("Your total: " + playerDeck.gameScore());
			System.out.println("Dealer's hand was:");
			dealerDeck.showHand(dealerDeck);
			System.out.println("Dealer's total: " + dealerDeck.gameScore());
			
			if(!playerExploded && !dealerExploded) {
				if(playerDeck.gameScore() > dealerDeck.gameScore()) {
					System.out.println("You win!!!!");
					loverPoints += bet;
				} else if(playerDeck.gameScore() == dealerDeck.gameScore()) {
					System.out.println("It's a tie!!!!");
				} else {
					System.out.println("You lost!!!!");
					loverPoints -= bet;
				}
			} else if(playerExploded && dealerExploded) {
				System.out.println("It's a tie!!!!");
			} else if(playerExploded) {
				System.out.println("You lost!!!!");
				loverPoints -= bet;
			} else {
				System.out.println("You win!!!!");
				loverPoints += bet;
			}
			System.out.println("you have " + loverPoints + " lover points");
		}
		
		if(loverPoints <= 0) {
			System.out.println("OUCH!! Your love thinks you are too thirsty, slaps you and runs away");
		} else if(loverPoints >= 100) {
			System.out.println("SUCCESS!! Your love has been crushing on you for a while now and wants to marry you right now!!");
		}
	}

}