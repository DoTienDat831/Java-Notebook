public class Array {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println(numbers[0]); // Output: 1
        System.out.println(numbers[1]); // Output: 2

        numbers[2] = 10; // Change the value at index 2
        System.out.println(numbers[2]); // Output: 10

        // Array length
        System.out.println("Array length: " + numbers.length); // Output: 5

        // Loop through the array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        for (int num : numbers) {
            System.out.println("Element: " + num);
        }
    }
}