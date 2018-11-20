import java.io.*;
import java.util.Scanner;
import java.util.Arrays;

public class MaxArrayValue {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("score.csv"));
		while(sc.hasNextLine()) {
			showMax(sc.nextLine());
		}
	}

	public static void showMax(String line) {
		String[] arrayOfLine = line.split(",");
		int[] scoreList = new int[arrayOfLine.length];
		for(int i = 0; i < arrayOfLine.length; i++) {
			scoreList[i] = Integer.parseInt(arrayOfLine[i]);
		}
		System.out.println("The max value of array " + Arrays.toString(scoreList) + " is " + findMax(scoreList));
	}

	public static int findMax(int[] scoreList) {
		int highestScore = 0;
		for(int score : scoreList) {
			if(score > highestScore) highestScore = score;
		}
		return highestScore;
	}

}