package prime;

import print.Printer;

public class Main {
	public static void main(String[] args) {
		
		Printer.printPaginatedList(new Primes(1000).generatePrimeNumbers(), 50, 6);

	}
}
