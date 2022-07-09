import java.util.Scanner;
public class BuildingDemo {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		Building [] annandaleCampusArray = new Building[10];
		int numberOfBuildings = 0;
		int option;
		
		do {
			System.out.println("Press 1 to add a new building to the campus");
			System.out.println("Press 2 to look at all the existing buildings on the campus");
			System.out.println("Press 3 to end the program");
			option = keyboard.nextInt();
			keyboard.nextLine(); //go to the next line
			
			if(option == 1) {
				System.out.println("What is the name of the new building?");
				String newName = keyboard.nextLine();
				
				System.out.println("How many rooms does the new building have?");
				int newNumberOfRooms = keyboard.nextInt();
				
				Building currentBuilding = new Building();
				currentBuilding.setName(newName);
				currentBuilding.setNumberOfRooms(newNumberOfRooms);
				
				if(numberOfBuildings < annandaleCampusArray.length) {
					annandaleCampusArray[numberOfBuildings] = currentBuilding;
					numberOfBuildings++; 
				}
				else {
					System.out.println("We've run of room for any additional buildings!");
				}
			}
			else if(option == 2) {
				//should loop through the array printing the name and the number of rooms of each building
				for(int index = 0; index < numberOfBuildings; index++) {
					System.out.println("Name: " + annandaleCampusArray[index].getName());  //you are printing the reference and not the instance variables
					System.out.println("Number of Rooms: " + annandaleCampusArray[index].getNumberOfRooms());
				}
			}
			else if(option == 3) {
				System.out.println("Thank you for using our program!");
			}
			else {
				System.out.println("Error! Invalid option! Try again!");
			}
		}while(option != 3);
		
	}

}
