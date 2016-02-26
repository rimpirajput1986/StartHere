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
			if (checkIfPrime(nthPrime, primes))
			{
				primes.add(nthPrime);
			}
			nthPrime+=2;
		}
		System.out.println("Nth Prime is: "+primes.get(n-1));
	}
	public static boolean checkIfPrime(int nthPrime, ArrayList<Integer> primes){
		int sqrt = (int) Math.sqrt(nthPrime);
		for (int i=0; i < primes.size(); i++)
		{
			if((nthPrime % primes.get(i)) == 0)
			{
				System.out.println("No. "+nthPrime+"is not Prime, it is divisible by"+i);
				return false;
			}
		}
//		primes.add(nthPrime);
		System.out.println("No. "+nthPrime+"is Prime");
		return true;
	}
}
