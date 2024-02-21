package movie;

import java.util.Scanner;

public class MovieDriver {
	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        
        boolean continueInput = true;

        while (continueInput) {
            // Prompting the user to enter movie details
            System.out.println("Enter the details of the movie:");
            
            // Creating a new Movie object
            Movie movie = new Movie();

            // Prompting the user to enter the title of the movie
            System.out.print("Enter the title: ");
            String title = scanner.nextLine();
            movie.setTitle(title);

            // Prompting the user to enter the rating of the movie
            System.out.print("Enter the rating: ");
            String rating = scanner.nextLine();
            movie.setRating(rating);

            // Prompting the user to enter the number of tickets sold for the movie
            System.out.print("Enter the number of tickets sold: ");
            int soldTickets = scanner.nextInt();
            movie.setSoldTickets(soldTickets);

            // Displaying the movie information using toString() method
            System.out.println("\nMovie Information:");
            System.out.println(movie);

            // Prompting the user if they want to continue
            System.out.print("\nDo you want to enter details for another movie? (yes/no): ");
            String choice = scanner.next();
            scanner.nextLine(); // Consume the newline character
            
            // Checking user response to continue or exit the loop
            continueInput = choice.equalsIgnoreCase("yes");
        }

        scanner.close();
    }
}
