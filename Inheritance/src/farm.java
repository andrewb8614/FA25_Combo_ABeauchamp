
public class farm {

	public static void main(String[] args) {
		
		Animal [] farm = new Animal[3];
		
		
		farm[0] = new Animal(66,24,"gracie");
		farm[1] = new Dog(71, 69, "lily", "lab", "chocolate");
		farm[2] = new Cat (15, 20, "marlie",false, false);
		
		for (Animal ani : farm) {
			System.out.println(ani);
			System.out.println(ani.makeNoise());
			System.out.println();
		}
		
		
//		System.out.println(ani);
//		System.out.println(dog);
//		System.out.println(dog.makeNoise());
//		System.out.println();
//
//		System.out.println(cat);
//		System.out.println(cat.makeNoise());
		
	}

}
