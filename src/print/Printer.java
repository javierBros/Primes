package print;


public class Printer {
	
	public static void printPaginatedList(int[] primeNumbers, int maxRows, int maxColumns){
		int pageNumber = 1;
		int indexStartPage = 1;
		for(indexStartPage = 1; indexStartPage < primeNumbers.length; indexStartPage += maxRows * maxColumns) {
			System.out.print("The First 1000 Prime Numbers === Page " + (pageNumber++) + "\n\n");
			for (int indexPrime = indexStartPage; indexPrime < indexStartPage + maxRows; indexPrime++) {
				for (int column = 0; column < maxColumns; column++)
					if (indexPrime + column * maxRows < primeNumbers.length)
						System.out.printf("%10d", primeNumbers[indexPrime + column * maxRows]);
				System.out.println();
			}
			System.out.println("\f");
		}
	}
}