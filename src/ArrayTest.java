import java.util.Arrays;
import java.util.Scanner;


public class ArrayTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the number of scores you'd like to add: ");
		int count = scan.nextInt();
		
		double scores[] = new double[count];
		
		for(int i = 0; i < scores.length; i++) {
			System.out.println("Please enter score #" + (i+1));
			scores[i] = scan.nextDouble();
		}
		
		printScore(scores);
		
		int choice = 0;
		
		do {
			System.out.println("Enter number [ 1 = Average, 2 = Median, 3 = Max, 4 = Min, 5 = Range, 0 = Exit ]");
			
			choice = scan.nextInt();
			
			switch (choice) {
			case 1 : //find average
				System.out.println("Average Score = " + getAverage(scores));
				break;
			case 3 : //find max score
				System.out.println("Highest Score = " + getMax(scores));
				break;
			case 4 : //find min score
				System.out.println("Lowest Score = " + getMin(scores));
				break;
			case 2 : //find median score
				System.out.println("Median Score = " + getMedian(scores));
				break;
			case 5 : //find range
				System.out.println("Range of Scores = " + getRange(scores));
				break;
			default : //do nothing
				break;
			}//end switch statement
			
			
			
		}while(choice != 0);//end while loop
		
		scan.close(); 
		
		System.out.println("Thank you !");
	}

	/**
	 * Method to calculate median.
	 * @param scores the score list for which median will be calculated.
	 * @return double the median score
	 */
	private static double getMedian(double[] scores) {
		double med = 0;
		
		Arrays.sort(scores);
		med = scores[(scores.length / 2)];
		
		return med;
	}

	/**
	 * Method to calculate Minimum.
	 * @param scores the score list for which minimum will be calculated.
	 * @return double the minimum score
	 */
	private static double getMin(double[] scores) {
		double min = 100;
		
		for (int i = 0; i < scores.length; i++) {
			if(scores[i] <= min){
				min = scores[i];
			}
		}
		
		return min;
	}

	/**
	 * Method to print score for the students
	 * @param scores the list of score. 
	 */
	private static void printScore(double[] scores) {
		for(int i = 0; i < scores.length; i++) {
			System.out.println("Score #" + (i+1) + " = " + scores[i]);
		}
	}
	
	/**
	 * Method to calculate maximum.
	 * @param scores the score list for which maximum will be calculated.
	 * @return double the maximum score
	 */
	private static double getMax(double[] scores) {
		double max = 0;
		
		for (int i = 0; i < scores.length; i++) {
			if(scores[i] >= max) {
				max = scores[i];
			}
		}
		
		return max;
	}

	/**
	 * Method to calculate average.
	 * @param scores the score list for which average will be calculated.
	 * @return double the average score
	 */
	private static double getAverage(double[] scores) {
		double result;
		
		double sum = 0;
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		
		result = sum / scores.length;
		
		return result;
	}
	/**
	 * Method to calculate the range of scores
	 * @param scores the score list for which the range will be caluclated
	 * @return double the range of the scores
	 */
	private static double getRange(double[] scores) {
		double range = getMax(scores) - getMin(scores);
		
		return range;
	}

}