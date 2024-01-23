import java.util.Scanner;

public class ExampleNullPointerException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a string: ");
            String str = scanner.nextLine();
            
            if (str != null) {
                int length = str.length();
                System.out.println("Length of the string: " + length);
            } else {
                System.out.println("Error: Input string is null.");
            }
        } catch (NullPointerException e) {
            System.out.println("Error: Attempted to access a null reference.");
        } finally {
            scanner.close();
        }
    }
}
