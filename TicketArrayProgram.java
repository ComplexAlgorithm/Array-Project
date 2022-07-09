import java.util.Scanner;
public class TicketArrayProgram {
	public static void main(String[] args) {
		int [] ticketArray = createArray();
		getTicketsSold(ticketArray);
		int total = computeTotal(ticketArray);
		print(ticketArray,total);

	}
	
	public static int [] createArray() {
		Scanner keyboard = new Scanner(System.in);
		int numberOfDays;
		do {
			System.out.println("How many days of tickets sales would you like to track?");
			numberOfDays = keyboard.nextInt();
			if(numberOfDays < 0) {
				System.out.println("Number of days cannot be less than 0! Try again!");
			}
		}while(numberOfDays < 0);
		
		int [] ticketArray = new int[numberOfDays];
		return ticketArray;
	}
	
	public static void getTicketsSold(int [] someArray) { 
		Scanner keyboard = new Scanner(System.in);
		for(int index = 0; index < someArray.length; index++) {
			int currentTickets; //declaring the variable outside loop so that stays in scope outside the loop
			do {
				System.out.println("Enter the number of tickets sold for Day " + (index+1));
				currentTickets = keyboard.nextInt();
				if(currentTickets < 0) {
					System.out.println("Error! Invalid number of tickets! Try again!");
				}
			}while(currentTickets < 0);
			someArray[index] = currentTickets;
		}
	}
	
	//create a method to compute the total tickets sold and return that value 
	public static int computeTotal(int [] tArray) {
		int sum = 0;
		for(int index = 0; index < tArray.length; index++) {
			sum = sum + tArray[index];
		}
		return sum;
	}
	
	//create a method to print the number of tickets for each day and the total
	public static void print(int [] ticketArray, int sum) {
		for(int index = 0; index < ticketArray.length; index++) {
			System.out.println("Tickets sold for Day " + (index+1) + ": " + ticketArray[index]);
		}
		System.out.println("Total tickets sold were: " + sum);
	}

}
