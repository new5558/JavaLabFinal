import java.util.Scanner;

public class KickBoxer {

	public static void main(String[] args) {
		int[] weightLimits = new int[]{150, 300, 450, 600, 750, 900};
		String[] weightCatories  = new String[]{"Fly Weight", "Light Weight", "Welter Weight", "Middle Weight", "Cruiser Weight", "Heavy Weight"};
		Scanner kb = new Scanner(System.in);
		int weight = kb.nextInt();

		if(weight < 0 || weight > weightLimits[weightLimits.length-1]) {
			System.out.println("It is not in range of weight");
			return;
		} 

		for(int i = 0; i < weightLimits.length; i++) {
			if(weight <= weightLimits[i]) {
				System.out.println(weightCatories[i]);
				break;
			}
		}
	}

}