package prime;

public class Primes {

	public static int[] generatePrimeNumbers(int amount){        
        int sizeCheckedPrimes = amount*8;
		int sqrt = (int) Math.floor(Math.sqrt(sizeCheckedPrimes));

        boolean[] checkedPrimes = new boolean[sizeCheckedPrimes + 1];

        for (int i = 2; i <= sqrt; i++) {
            if (checkedPrimes[i] == false) {
                for (int j = i; j <= sizeCheckedPrimes / i; j++) {
                    checkedPrimes[j * i] = true;
                }
            }
        }
        
        return createArrayNumbers(checkedPrimes, amount);
    }
	
	private static int[] createArrayNumbers(boolean[] markedValues, int amount) {
		int[] numbers = new int[amount + 1];
		int index = 1;
		for (int i = 2; i < markedValues.length; i++) {
			if (!markedValues[i]) {
				numbers[index++] = i;
				if (index == amount + 1)
					break;
			}
		}
		return numbers;
	}
	
	
}
