package one;

import java.util.ArrayList;
import java.util.Scanner;

public class NthPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the value of n, (to find the nth Prime number) :");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int nthPrime = 3;
		ArrayList<Integer> primes = new ArrayList<Integer>();
		while(primes.size()<n)
		{
			if (checkIfPrime(nthPrime))
			{
				primes.add(nthPrime);
			}
			nthPrime+=2;
		}
		System.out.println("Nth Prime is: "+primes.get(n-1));
	}
	public static boolean checkIfPrime(int nthPrime){
		int sqrt = (int) Math.sqrt(nthPrime);
		for (int i=2; i <= sqrt; i++)
		{
			if((nthPrime % i) == 0)
			{
				System.out.println("No. "+nthPrime+"is not Prime, it is divisible by"+i);
				return false;
			}
		}
		System.out.println("No. "+nthPrime+"is Prime");
		return true;
	}
}
