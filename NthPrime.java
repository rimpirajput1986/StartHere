package one;

import java.util.ArrayList;
import java.util.Scanner;

public class NthPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out
				.println("Enter the value of n, (greater than 2, to find the nth Prime number, 1st being 2, 2nd -> 3) :");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int nthPrime = 3;
		ArrayList<Integer> primes = new ArrayList<Integer>();
		primes.add(2);
		while (primes.size() < n) {
			if (checkIfPrime(nthPrime, primes)) {
				primes.add(nthPrime);
			}
			nthPrime += 2;
		}
		System.out.println("Nth Prime is: " + primes.get(n - 1));
	}

	public static boolean checkIfPrime(int nthPrime, ArrayList<Integer> primes) {
		int sqrt = (int) Math.sqrt(nthPrime);
		for (int i = 0; primes.get(i) <= sqrt; i++) {
			if ((nthPrime % primes.get(i)) == 0) {
				System.out.println("No. " + nthPrime
						+ "is not Prime, it is divisible by" + primes.get(i));
				return false;
			}
		}
		// primes.add(nthPrime);
		System.out.println("No. " + nthPrime + "is Prime");
		return true;
	}
}
