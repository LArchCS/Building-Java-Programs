package Chapter7;

import java.util.*;

public class Temperature3 {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("How many days' temperatures? ");
		int numDays = console.nextInt();
		int[] temps = new int[numDays];
		
		// record temperatures and find average
		int sum = 0;
		for (int i = 0; i < numDays; i++) {
			System.out.print("Day " + (i+1) + "'s high temp: ");
			temps[i] = console.nextInt();
			sum += temps[i]; 
		}
		double average = (double)sum / numDays;
		
		// count days above average
		// use the For-Each Loop
		int above = 0;
		for (int n : temps) {
			if (n > average) {
				above += 1;
			}
		}
		
		// report results
		System.out.println();
		System.out.println("Average = " + average);
		System.out.println(above + " days above average");
		console.close();
	}
}
