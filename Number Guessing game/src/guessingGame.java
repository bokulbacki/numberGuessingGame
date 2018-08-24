
import java.util.Scanner;


public class guessingGame
	{
		static int multiplier;
		static int add;
		static int numberOfGuesses;
		static Scanner userInput = new Scanner(System.in);
		static Scanner userInput1 = new Scanner(System.in);
		static int guess;
		static int secretNumber1;
		static boolean play; 
		
		public static void main(String[] args)
			{
				play=true;
				greetPlayer();
			while (play)
				{

				chooseDifficulty();
				generateNumber();
				askForGuess();
				evaluateGuess();
				askToPlayAgain();
				}
			}
		
				public static void greetPlayer()
				{
					System.out.println("What is your name?");
					String name = userInput.nextLine();
					System.out.println("Hello " + name);
				}
				
				public static void chooseDifficulty()
				{
					System.out.println("This is a number guessing game... Please choose the level of difficulty you would like.");
					System.out.println("1 = 1-5. 2 = 1-10. 3 = 1-500.");
					int level = userInput.nextInt();
					
					if (level==1)
						{
							multiplier = 5;
							add = 1;
						}
					else if (level ==2)
						{
							multiplier=10;
							add = 1;
						}
					else if (level==3)
						{
							multiplier=500;
							add=1;
						}
					System.out.println("Enter your first guess please.");
				}
				
				public static void generateNumber()
				{
					secretNumber1 = (int)(Math.random()*multiplier ) +add;
				}
				
				public static void askForGuess()
				{
					 guess = userInput1.nextInt();
				}
				
				public static void evaluateGuess()
				{
					boolean stillGuessing= true;	
					while (stillGuessing)
						{
							
							if (guess == secretNumber1)
								{
									System.out.println("correct brother");
									stillGuessing= false;
								}
							
							else if (guess > secretNumber1)
								{
									System.out.println("Too high");
									System.out.println("Guess again");
									askForGuess();									
								}
							else if (guess < secretNumber1)
								{
									System.out.println("Too Low");
									System.out.println("Guess again");	
									askForGuess();
								}
							
							numberOfGuesses++;
						}
					System.out.println("Congrats it only took you " + numberOfGuesses +" tries!");
				}
				
				public static void askToPlayAgain()
				{
					
					System.out.println("Would you like to play again?");
					System.out.println("1 = Yes    2 = No");
					int playInput = userInput.nextInt();
					if (playInput==1)
						{
							play=true;
						}
					else
						{
							play=false;
							System.out.println("Thanks for playing");
						}
				}
				
				
			

	}
