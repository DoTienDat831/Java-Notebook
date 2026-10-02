public class Casting {
    public static void main(String[] args) {
        // Widening Casting (automatically) - converting a smaller type to a larger type size
        int a = 10;
        double b = a;

        // Narrowing Casting (manually) - converting a larger type to a smaller size type
        double c = 19.99;
        int d = (int) c; // Manual casting: double to int

        // Char to numbers
        char e = 'A';
        int f = e; // Widening Casting: char to int

        System.out.println("Widening Casting: " + b); // 10.0
        System.out.println("Narrowing Casting: " + d); // 19
        System.out.println("Char to int: " + f); // 65
    }
}

