import java.util.Scanner;

public class ExampleArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int[] numbers = {1, 2, 3};
            
            System.out.print("Enter the index: ");
            int index = scanner.nextInt();
            
            int value = numbers[index]; // This line may throw an ArrayIndexOutOfBoundsException
            System.out.println("Value at index " + index + ": " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Attempted to access an array element outside its bounds.");
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: Invalid input. Please enter an integer.");
        } finally {
            scanner.close();
        }
    }
}
