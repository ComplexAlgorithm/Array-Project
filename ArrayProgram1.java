import java.util.Scanner;
public class ArrayProgram1 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("How many days would you like to track the temperature of?");
		int numberOfDays = keyboard.nextInt();
		
		double [] tempArray;  //reference to an array
		if(numberOfDays > 0) {
			tempArray = new double[numberOfDays];
		}
		else {
			tempArray = new double[5];
		}
		
		for(int index = 0; index < tempArray.length; index++) {
			System.out.println("Enter the temperature for Day " + (index+1));
			double currentTemperature = keyboard.nextDouble();
			tempArray[index] = currentTemperature;
		}
		
		//use a for loop to calculate the sum of all the temperatures
		//then calculate the average and print it to the screen
		double sum = 0.0;
		for(int index = 0; index < tempArray.length; index++) {
			sum = sum + tempArray[index];
		}
		
		double average = sum / (double)tempArray.length; //type casting
		System.out.println("Average: " + average);
		
		//find the highest temperature in the array and print it to the screen
		double highestTemperature = tempArray[0];
		for(int index = 1; index < tempArray.length; index++) {
			if(tempArray[index] > highestTemperature) {
				highestTemperature = tempArray[index];
			}
		}
		
		System.out.println("Highest Temperature: " + highestTemperature);
		
		//find the lowest temperature by looping through the array starting at the
		//last index and going back to index 0 
		//print the lowest temperature
		double lowestTemperature = tempArray[tempArray.length-1]; //last element in the array
		for(int index = tempArray.length-2; index > -1; index--) {
			if(tempArray[index] < lowestTemperature) {
				lowestTemperature = tempArray[index];
			}
		}
		
		System.out.println("Lowest Temperature: " + lowestTemperature);
	}

}