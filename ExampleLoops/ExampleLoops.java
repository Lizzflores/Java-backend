public class ExampleLoops {

	public static void main(String[] args) {
		int counter = 1;
		int total = 0;
		// while loop
		while (counter <= 10) { // while the condition is true
			// Execute this
			total = total + counter;
			counter++; // same as counter = counter + 1; or counter += 1;
		}
		System.out.println(total);
		// for loop
		for (int count = 0; count <= 10; count++) {
			System.out.println(count);
		}
		// nested loops - multiplication table
		for (int outer = 0; outer <= 10; outer++) {
			for (int inner = 0; inner <= 10; inner++) {
				System.out.print(outer * inner);
				System.out.print(" ");
			}
			System.out.println();
		}
		// loop break - matrix exercise
		for (int row = 0; row <= 10; row++) {
			for (int column = 0; column <= 10; column++) {
				if (column > row) {
					break;
				}
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
