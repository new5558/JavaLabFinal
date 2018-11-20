import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class EvenNumbers {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		// in the lastest version of Java, ArrayList<Integer>() is deprecated.
		// use ArrayList<>(); instead

		while(true) {
			Scanner kb = new Scanner(System.in);
			int number = kb.nextInt();
			if(number <= 0) break;
			list.add(number);
		}

		System.out.println(Arrays.toString(list.toArray()));

		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) % 2 != 0) {
				list.remove(i);
				i--;
			}
		}

		System.out.println(Arrays.toString(list.toArray()));
	}

}