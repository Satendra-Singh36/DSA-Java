package Arrays;
import java.util.Scanner;
public class ArraySumAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();

        // Declare and input array
        int[] numbers = new int[size];
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Calculate sum
        long sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        // Calculate average
        double average = (double) sum / size;

        // Output results
        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average of array elements: " + average);
        scanner.close();
    }
}
