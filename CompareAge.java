public class CompareAge {

	public static void main(String[] args) {
		Person p1 = new Person("Junior", 15);
		Person p2 = new Person("Jame", 25);
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		if(p1.isOlder(p2)) System.out.println(p2.getName());
		else System.out.println(p2.getName());
	}

}