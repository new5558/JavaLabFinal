import java.util.Scanner;

public class BinarySearch {
	
	public static void main(String[] args) {
		int[] list = {2,4,5,10,15,16,17,20,22,50,65};
		
		Scanner kb = new Scanner(System.in);
		int value = kb.nextInt();
		int pos_value = indexOf(list, value, 0, list.length - 1);

		if(pos_value == -1) {
			System.out.println("value " + value + " not found");
		}else {
			System.out.println("the index of value " + value + " is " + pos_value);
		}
	}
	
	public static int indexOf(int[] list, int value, int pos_left, int pos_right){
		int pos_center = (pos_right + pos_left)/2;;
		int currentValue = list[pos_center];
		// System.out.println("right " + pos_right + " left " + pos_left);
		if(value == currentValue) return pos_center;
		else if(pos_right - pos_left == 1) return -1;
		else if(value > currentValue) return indexOf(list, value, pos_center, pos_right);
		// else if(value < currentValue) 
		return indexOf(list, value, pos_left, pos_center);
	}
}
