import java.util.Scanner;

public class EulerPhi {

    // Function to calculate Euler's Totient function for an integer n
    public static int eulerPhi(int n) {
        int result = n; // Initialize result as n

        // Check for all prime factors of n and apply the formula
        for (int p = 2; p * p <= n; p++) {
            // Check if p is a prime factor of n
            if (n % p == 0) {
                // If yes, subtract multiples of p from result
                while (n % p == 0) {
                    n /= p; // Remove all occurrences of p from n
                }
                result -= result / p; // Apply the formula: result = result * (1 - 1/p)
            }
        }

        // If n has a prime factor greater than sqrt(n), apply the formula
        if (n > 1) {
            result -= result / n;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int phiValue = eulerPhi(n);
        System.out.println("Euler's Totient Function (phi) value for " + n + " is: " + phiValue);

        scanner.close();
    }
}
