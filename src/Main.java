/*
 * Manny Peterson's Solution to Project Euler Problem #3
 * https://projecteuler.net/problem=3
 * 
 * Enjoy! :)
 * 
 */

public class Main {
	public static boolean isPrime(long n) {
		if (n <= 1)
			return false;
		if (n > 2 && (n & 1) == 0)
			return false;
		for (long i = 3; i <= Math.sqrt(n); i += 2)
			if (n % i == 0)
				return false;
		return true;
	}

	public static void main(String[] args) {
		long num = 600851475143L, largest = 0;
		for (long i = 1; i < Math.sqrt(num); i++)
			if (num % i == 0)
				if (Main.isPrime(i))
					largest = i;
		System.out.format("ANSWER = %d\n", largest);
	}
}
