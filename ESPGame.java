/*
 * Class: CMSC203 
 * Instructor: Farnaz Eivazi
 * Description: This program randomly selects a color (Red, Green, Blue, Orange, Yellow, Purple, and Pink) and then the user has to guess which color the program selected. At the end of the game, the number of correct guesses is added up and printed out to the console. 
 * Due: 09/14/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: Ezra Atnafie
*/

package ESPpackage;

import java.util.Scanner;
import java.util.Random;

public class ESPGame {

	public static void main(String[] args) {
		
			Scanner scanner = new Scanner(System.in);
	        System.out.print("Please enter your name: "); //Prompts user for their name
			String name = scanner.nextLine();
			
			System.out.print("Enter your MC M#: "); //Prompts user for their MC M#
	        String mcMNumber = scanner.nextLine();
			
	        System.out.print("Describe yourself: "); //Prompts user for brief description of themselves
	        String description = scanner.nextLine();
	        
	        System.out.print("Due Date: "); //Prompts user for Due Date
	        String dueDate = scanner.nextLine();
	        System.out.print("\n");
	        
	        String[] colorNames = {"Red", "Green", "Blue", "Orange", "Yellow", "Purple", "Pink"}; //Declaring String for color names
	        
	        int correctGuesses = 0; 
	        Random random = new Random();
	        
	        for (int round = 1; round <= 11; round++)
	        {
	        	int randomIndex = random.nextInt(colorNames.length);
	            String selectedColor = colorNames[randomIndex];
	            
	            //Prints out the round and prompts the user to guess the color
	            System.out.println("Round " + round);
	            System.out.print("Guess the color: ");
	            String userGuess = scanner.nextLine();
	            
	            //Prints out the correct color (color the program selected)
	            System.out.println("The selected color was: " + selectedColor);
	            
	            //If/Else statement that prints out "Correct!" if true, "Incorrect" if false
	            if (userGuess.equalsIgnoreCase(selectedColor)) 
	            {
	                System.out.println("Correct!");
	                correctGuesses++;
	            } 
	            else 
	            {
	                System.out.println("Incorrect.");
	            }
	        }
	        
	        //Closing Statements 
	        System.out.println("Game Over");
	        System.out.println(name + " (MC M# " + mcMNumber + ")");
	        System.out.println("Description: " + description);
	        System.out.println("Due Date: " + dueDate);
	        System.out.println("Total correct guesses: " + correctGuesses);
	    }
	
}
