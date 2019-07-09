import java.util.ArrayList;
import java.util.Scanner;

public class MoviesApp {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Welcome to the Movie List Application!");
		System.out.println();

		
		ArrayList<Movie> moviesList = new ArrayList<>();
		 

		System.out.println("There are 10 movies in this list.");
		
		String userInput = " ";
		boolean movieValid = true; 
		
		do { 
			System.out.println("What category are you interested in?");
			userInput = scnr.nextLine();
			
			
			 while (movieValid) {

				Movie mv1 = new Movie(userInput, userInput);
				mv1.setTitle("Star Wars");
				mv1.setCategory("SciFi");
				moviesList.add(mv1);

				Movie mv2 = new Movie(userInput, userInput);
				mv2.setTitle("Lord of the Rings");
				mv2.setCategory("Fantasy");
				moviesList.add(mv2);

				Movie mv3 = new Movie(userInput, userInput);
				mv3.setTitle("Aladdin");
				mv3.setCategory("Animated");
				moviesList.add(mv3);

				Movie mv4 = new Movie(userInput, userInput);
				mv4.setTitle("Chronicles of Narnia");
				mv4.setCategory("Fantasy");
				moviesList.add(mv4);

				Movie mv5 = new Movie(userInput, userInput);
				mv5.setTitle("Us");
				mv5.setCategory("Horror");
				moviesList.add(mv5);

				Movie mv6 = new Movie(userInput, userInput);
				mv6.setTitle("Scream");
				mv6.setCategory("Horror");
				moviesList.add(mv6);

				Movie mv7 = new Movie(userInput, userInput);
				mv7.setTitle("Black Panther");
				mv7.setCategory("SciFi");
				moviesList.add(mv7);

				Movie mv8 = new Movie(userInput, userInput);
				mv8.setTitle("The Lion King");
				mv8.setCategory("Animated");
				moviesList.add(mv8);

				Movie mv9 = new Movie(userInput, userInput);
				mv9.setTitle("Labyrinth");
				mv9.setCategory("Fantasy");
				moviesList.add(mv9);

				Movie mv10 = new Movie(userInput, userInput);
				mv10.setTitle("Ten Miles of Peach Blossoms");
				mv10.setCategory("Fantasy");
				moviesList.add(mv10);

				// How to make it not repeat....
				for (int i = 0; i < moviesList.size(); i++) {
					if (userInput.equalsIgnoreCase(moviesList.get(i).getCategory())) {
						System.out.println(moviesList.get(i));

					}
				}
				
				break;

			}
			

			System.out.println("Continue? (y/n)");
			userInput = scnr.nextLine();
			if (userInput.equalsIgnoreCase("n")) {
				break;
			}
			
		} while (userInput.equalsIgnoreCase("y"));
		
		System.out.println();
	}

}
