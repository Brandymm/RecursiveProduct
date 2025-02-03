import java.util.Scanner;

public class RecursiveProduct {

    // Recursive method to calculate the product of numbers
    public static int calculateProduct(int[] numbers, int index) {
        // Base case: When the index reaches the length of the array, we stop recursion and return 1.
        // This is the identity for multiplication, ensuring the recursive multiplication works.
        if (index == numbers.length) {
            return 1;
        }

        // Recursive case: multiply the current number at 'index' with the result of the next recursive step.
        return numbers[index] * calculateProduct(numbers, index + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array to store the five numbers
        int[] numbers = new int[5];

        // Prompt the user to enter five numbers
        System.out.println("Please enter 5 numbers:");

        // Input the five numbers with error handling
        for (int i = 0; i < 5; i++) {
            while (true) {
                System.out.print("Enter number " + (i + 1) + ": ");
                String input = scanner.nextLine();  // Correctly using nextLine() to read input as a string
                
                try {
                    // Try to parse the input to an integer
                    numbers[i] = Integer.parseInt(input);
                    break;  // Break the loop if the input is valid
                } catch (NumberFormatException e) {
                    // Handle invalid input (non-integer)
                    System.out.println("Invalid input! Please enter a valid integer.");
                }
            }
        }

        // Call the recursive method to calculate the product
        int product = calculateProduct(numbers, 0);

        // Output the result
        System.out.println("The product of the entered numbers is: " + product);

        // Close the scanner
        scanner.close();
    }
}
