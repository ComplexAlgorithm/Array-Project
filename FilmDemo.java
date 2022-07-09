/*
 * Finally, demonstrate a prototype of this program by allowing the user to create up to ten films
stored as an array of films. Provide the user with a menu of options to add a film, to look at all
the films, or to end the program. Once a film is created it should be stored so that it can be
accessed again. There should be an option to display all the information for all films entered so
far.
 */
import java.util.Scanner;
public class FilmDemo {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		Film [] filmArchiveArray = new Film [3];
		int numberOfFilms = 0;
		int option;
		do {
			System.out.println("Press 1 to add a film to the archive.");
			System.out.println("Press 2 to look at all of the films.");
			System.out.println("Press 3 to end the program.");
			option = keyboard.nextInt();
			keyboard.nextLine();
			
			if(option == 1) {
				System.out.println("What is the name of the film you'd like to add?");
				String newFilmName = keyboard.nextLine();
				
				System.out.println("Whats is the name of the director?");
				String newDirectorName = keyboard.nextLine();
				
				System.out.println("What year was the film released?");
				int newYearReleased = keyboard.nextInt();
				
				Film currentFilm = new Film();
				currentFilm.setFilmName(newFilmName);
				currentFilm.setDirectorName(newDirectorName);
				currentFilm.setYearReleased(newYearReleased);
				
				if(numberOfFilms < filmArchiveArray.length) {
					filmArchiveArray[numberOfFilms] = currentFilm;
					numberOfFilms++;
				}
				else {
					System.out.println("The archive has run out of space!");
				}
				
				
			}
			else if(option == 2) {
				for(int i = 0; i < numberOfFilms; i++) {
					System.out.println("Film Name: " + filmArchiveArray[i].getFilmName());
					System.out.println("Direcctor Name: " + filmArchiveArray[i].getDirectorName());
					System.out.println("Year Released: " + filmArchiveArray[i].getYearReleased());
				}
			}
			else if(option == 3) {
				System.out.println("GoodBye!");
			}
			else {
				System.out.println("Error!");
			}
		}while(option != 3);
		

	}

}
