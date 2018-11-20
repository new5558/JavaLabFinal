import java.util.Scanner;

public class TriangleArray {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int dimension = kb.nextInt();
		int[][] row = new int[dimension][];
		int tempNumber = 0;

		for(int i = 0; i < row.length; i++) {
			row[i] = new int[i+1];
			for(int j = 0; j < row[i].length; j++) {
				row[i][j] = tempNumber++;
			}

			for(int result : row[i]) {
				System.out.print(result + " ");
			}
			System.out.println();			
		}

	}

}