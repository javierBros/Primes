package prime;

import print.Printer;

public class Main {
	public static void main(String[] args) {
		
		Printer.printPaginatedList(Primes.generatePrimeNumbers(1000), 50, 4);

	}
}
