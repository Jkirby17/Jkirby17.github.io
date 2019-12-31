
public class A6dot26 {

	public static void main(String[] args) {
		// Find 100 palindromic primes
		System.out.printf("%7d", 2);
		for(int number = 3, count = 1; count < 100; number +=2) {
			if (isPal(number)&& isPrime(number)) {
				System.out.printf("%7d", number);
				if (++count % 10 == 0) {
					System.out.println();
				}
			}
		}
	}
		
		private static boolean isPrime(int number) {
			for(int i = 2; i <= Math.sqrt(number); i ++) {
				if (number % i == 0) {
					return false;
				}
			}
			return true;
		}
		
		private static boolean isPal(int number) {
			String s = number + "";
			for (int left = 0, right = s.length() - 1; left < right; left++, right-- ) {
				if(s.charAt(left) != s.charAt(right)) {
					return false;
				}
			}
			return true;

	
	}

}
