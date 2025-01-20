import java.util.Scanner;


public class RecursiveProduct {
	
	// Recursive method to calculate the product of numbers
	public static int calculateProduct(int[] numbers, int index) {
		// Base case: If we've processed all numbers, return 1 (identity for multiplication)
		if (index == numbers.length) {
			return 1;
		}
		
		// Recursive case: multiply the current number with the result of the next numbers
		return numbers[index] * calculateProduct(numbers, index + 1);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		// Array to store the five numbers
		int[] numbers = new int[5];
		
		// Prompt the user to enter five numbers
		System.out.println("Please enter 5 numbers:");
		
		// Input the five numbers
		for (int i = 0; i < 5; i++) {
			System.out.print("Enter number " + (i + 1) + ": ");
			numbers[i] = scanner.nextInt();
		}
		
		
		// Call the recursive method to calculate the product
		int product = calculateProduct(numbers, 0);
		
		// Output the result
		System.out.println("The product of the entered numbers is: " + product);
	}

}
