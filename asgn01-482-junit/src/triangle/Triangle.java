/**
 * This class represents a simple triangle
 * @author Raunak
 * @version 1.0 1/21/2014
 */
package triangle;

public class Triangle {
	
		// triangleType will identify the triangle type when known
	private String triangleType;
	
	/**
	 * Default constructor - just return an uninitialized triangle
	 */
	public Triangle() {
		 triangleType = new String("Unset");		
	}
	
	/**
	 * Build a triangle with the given integer lengths 
	 * @param side1 an integer length of the first side
	 * @param side2 an integer length of the second side
	 * @param side3 an integer length of the third side
	 * @throws InvalidTriangle
	 */
	public Triangle(int side1, int side2, int side3) throws InvalidTriangle {
		if (!isValidInput(side1,side2,side3)) {
			throw(new InvalidTriangle("Invalid input value(s)"));
		}
		
		if (!isLegalTriangle(side1,side2,side3)){
			throw(new InvalidTriangle("Not a triangle"));
		}
		
		if (isEquilateral(side1,side2,side3)) {
			triangleType = new String("Equilateral");
		}

		else if (isIsoceles(side1,side2,side3)) {
			triangleType = new String("Isoceles");
		}
		
		else if (isScalene(side1,side2,side3)){
			triangleType = new String("Scalene");
		}
		
		else {
			triangleType = new String("Undeterminable");
		}
	}
	
	/**
	 * Returns the triangle type as a string
	 */
	public String toString(){
		return triangleType;
	}
	
	/**
	 * Validates that the input are positive integers
	 * @param side1 an integer length of the first side
	 * @param side2 an integer length of the second side
	 * @param side3 an integer length of the third side
	 * @return true iff a, b, and c are positive integers
	 */
	public boolean isValidInput(int side1, int side2, int side3) {
		boolean retval = true;
		if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
			retval = false;
		}
		return retval;
	}

	/**
	 * Validates that a triangle with these side lengths is geometrically possible
	 * @param side1 an integer length of the first side
	 * @param side2 an integer length of the second side
	 * @param side3 an integer length of the third side
	 * @return true iff the sum of any two sides is less than the third
	 */
	public boolean isLegalTriangle(int side1, int side2, int side3) {
		boolean retval = true;
		if (side1+side2 <= side3 || side1+side3 <= side2 || side2+side3 <= side1) {
			retval = false;
		}
		return retval;
	}
	
	/**
	 * Validates that the triangle is equilateral
	 * @param side1 an integer length of the first side
	 * @param side2 an integer length of the second side
	 * @param side3 an integer length of the third side
	 * @return true iff a == b == c
	 */
	public boolean isEquilateral(int side1, int side2, int side3) {
		boolean retval = false;
		if (side1 == side2 && side2 == side3) {
			retval = true;
		}
		return retval;
	}

	/**
	 * Validates that the triangle is isoceles
	 * @param side1 an integer length of the first side
	 * @param side2 an integer length of the second side
	 * @param side3 an integer length of the third side
	 * @return true iff any two sides are equal, but not all three
	 */
	public boolean isIsoceles(int side1, int side2, int side3) {
		boolean retval = false;
		if (!isEquilateral(side1,side2,side3) && 
				(side1 == side2 || side2 == side3 || side1 == side3)) {
			retval = true;
		}
		return retval;
	}

	/**
	 * Validates that the triangle is scalene
	 * @param side1 an integer length of the first side
	 * @param side2 an integer length of the second side
	 * @param side3 an integer length of the third side
	 * @return true iff all three side lengths are distinct
	 */
	public boolean isScalene(int side1, int side2, int side3) {
		boolean retval = false;
		if (side1 != side2 && side1 != side3 && side2 != side3) {
			retval = true;
		}
		return retval;
	}
}
