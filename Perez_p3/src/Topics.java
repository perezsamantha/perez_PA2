import java.util.Scanner;

public class Topics {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int numPeople, i, j, rating, total, highestPoints, lowestPoints;
		double average;
		String highestTopic = "";
		String lowestTopic = "";
		
		String[] topics = {"climate change", "college safety", "poverty", "education disparity", "gun violence reform"};
		
		int[][] arr = new int[5][10];
		
		System.out.println("How many people will be taking the survey?");
		numPeople = scnr.nextInt();
		
		System.out.println("Topics: ");
		for (i = 0; i < topics.length; i++) {
			System.out.println(topics[i]);
		}
		
		System.out.println();
		System.out.println("Rate each of the topics above on a scale of 1 - 10:\n");
		
		for (i = 0; i < numPeople; i++) {
			for(j = 0; j < topics.length; j++) {
				rating = scnr.nextInt();
				arr[j][rating - 1]++;
			}
		}
		
		System.out.printf("%20s", "");
		for (i = 1; i < 11; i++) {
			System.out.printf("%4d", i);
		}
		
		System.out.printf("%11s%n", "Average");
		System.out.printf("%22s", "");
		System.out.println("--------------------------------------------------");
		
		highestPoints = 0;
		lowestPoints = 0;
		
		for (i = 0; i < topics.length; i++) {
			total = 0;
			
			System.out.printf("%20s", topics[i]);
			for (j = 0; j < arr[i].length; j++) {
				System.out.printf("%4d", arr[i][j]);
				total += (arr[i][j] * (j+1));
			}
			
			average = (double)total / numPeople;
			System.out.printf("%3s%6.2f%n", "|", average);
			System.out.println();
			
			if (i == 0) {
				highestPoints = total;
				lowestPoints = total;
			}
			
			// If there is a tie, highestTopic/lowestTopic will be assigned to the topic furthest down the list
			
			if (total >= highestPoints) {
				highestTopic = topics[i];
				highestPoints = total;
			}
			if (total <= lowestPoints) {
				lowestTopic = topics[i];
				lowestPoints = total;
			}
		}
		
		System.out.println(highestTopic + " was surveyed as the most important topic with " + highestPoints + " points");
		System.out.println(lowestTopic + " was surveyed as the least important topic with " + lowestPoints + " points");
		scnr.close();
	}

}
