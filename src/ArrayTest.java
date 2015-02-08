import java.util.Scanner;
import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the number of scores you'd like to add: ");
		int l = scan.nextInt();
		
		double scores[] = new double[l];
		
		for(int i = 0; i < scores.length; i++) {
			
			System.out.println("Please enter score #" + (i+1));
			scores[i] = scan.nextDouble();
		}
		
		boolean go = true;
		while(go) {
			System.out.println("Enter 'A' to Average scores\nEnter 'MED' for the Median score\nEnter 'MAX' to find maximum score\n"
					+ "Enter 'MIN' to find minimum score \nChoice:");
			String choice = scan.next();
			
			switch (choice) {
			case "A" : //find average
				double sum = 0;
				for(int i = 0; i < scores.length; i++) {
					sum += scores[i];
				}
				double avg = sum/scores.length;
				System.out.println("Average Score = " + avg);
				break;
			case "MAX" : //find max score
				double max = 0;
				for (int i = 0; i < scores.length; i++) {
					if(scores[i] >= max) {
						max = scores[i];
					}
				}
				System.out.println("Highest Score = " + max);
				break;
			case "MIN" : //find min score
				double min = 100;
				for (int i = 0; i < scores.length; i++) {
					if(scores[i] <= min){
						min = scores[i];
					}
				}
				System.out.println("Lowest Score = " + min);
				break;
			case "MED" : //find median score
				double med = 0;
				Arrays.sort(scores);
				med = scores[(scores.length/2)];
				System.out.println("Median Score = " + med);
				break;
			default : //displays the scores by index
				for(int i = 0; i < scores.length; i++) {
					System.out.println("Score #" + (i+1) + " = " + scores[i]);
				}
			}//end switch statement
			
			System.out.println("Would you like to perform another operation? Enter: Y/N");//option to quit while loop
			String cont = scan.next();
			if(cont.equals("N")){
				go = false;
			} else {
				go = true;
			}
			
		}//end while loop
		
	}//end main class

}
