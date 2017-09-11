/**
 * This is a simple function that takes user input to define a triangle
 */
package triangle;

import java.util.Scanner;


public class TriangleTextUI {

	/**
	 * @param args - ignored
	 */
	public static void main(String[] args) {
		new TriangleTextUI();
	}
	
	/**
	 * This function requests three integers and tries to make a triangle.
	 */
	public TriangleTextUI() {
		System.out.println("Enter the integer length of the three sides (separated by white space):");
		
		Scanner in = new Scanner(System.in);
		int sideA = 0;
		int sideB = 0;
		int sideC = 0;
		
		try {
			sideA = in.nextInt();
			sideB = in.nextInt();
			sideC = in.nextInt();
		}
		catch (RuntimeException err) {
			// If there is any problem, quit.
			System.out.println("Invalid input value(s)");
			return;
		}
		
		Triangle triangle = null;
		try {
			triangle = new Triangle(sideA,sideB,sideC);
		}
		catch (InvalidTriangle err) {
			// Check and see if we failed to create a triangle.
			System.out.println("Error: " + err.toString());
		}
		
		if (triangle != null) {
			// Display the triangle type.
			System.out.println("Your triangle is a/an " + triangle.toString() + " triangle.");
		}
	}

}
