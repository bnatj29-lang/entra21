public class Array {
	public static void main(String[] args) {

		String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };

		System.out.println(cars[0]);
		System.out.println(cars[2]);

		cars[2] = "Chevrolet";
		System.out.println(cars[2]);

		System.out.println("");

		for (int i = 0; i < cars.length; i++) {
			System.out.println(i + "-> " + cars[i]);
		}
		
		System.out.println("");
		int x = 0;
		while (x < cars.length) {
			System.out.println(x + "-> " + cars[x]);
			x++; 
		}
		
		System.out.println("");
		for(String c : cars ) {
			System.out.println(c);
		}
	}
	
	

}
