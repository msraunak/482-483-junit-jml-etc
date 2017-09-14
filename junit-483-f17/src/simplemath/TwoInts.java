package simplemath;
/**
 * A Simple class that has 
 * @author raunak
 *
 */
public class TwoInts {

	private int num1;
	private int num2;
	
	// Default Constructor
	public TwoInts() {
		this.num1 = 1;
		this.num2 = 2;
	}
	
	// Overloaded constructor
	public TwoInts(int n1, int n2) {
		this.num1 = n1;
		this.num2 = n2;
	}
	
	/**
	 * @return sum of the two instance variable num1 and num2 values
	 */
	public int sumOfTwo() {
		return num1 + num2;
	}
	
	/**
	 * @return the positive difference between the two values
	 */
	public int difference() {
		if (num1 > num2)
			return num1 - num2;
		else 
			return num2 - num1;
	}
	
	/**
	 * @return larger of the two values
	 */
	public int larger() {
		if (num2>num1)
			return num2;
		return num1;
	}
	
	
	
	// getter method
	public int getNum1() {
		return num1;
	}
	// setter method
	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	
	
	
	
	
}
