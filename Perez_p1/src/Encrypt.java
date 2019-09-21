import java.util.Scanner;

public class Encrypt {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int userNum, i, divNum, tmp;
		final int DIGIT_LENGTH = 4;
		
		System.out.println("Enter the number you would like to encrypt:");
		userNum = scnr.nextInt();
		
		int[] arr = new int[4];
		
		divNum = 1000;
		
		for (i = 0; i < 4; i++) {
			arr[i] = ((userNum / divNum) + 7) % 10;
			userNum %= divNum;
			divNum /= 10;
		}
		
		tmp = arr[0];
		arr[0] = arr[2];
		arr[2] = tmp;
		
		tmp = arr[1];
		arr[1] = arr[3];
		arr[3] = tmp;
		
		System.out.print("Your encrypted number is: ");
		
		for (i = 0; i < DIGIT_LENGTH; i++) {
			System.out.print(arr[i]);
		}
		
		System.out.println();
		scnr.close();
	}
}
