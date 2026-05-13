package numberPrograms;

//Prime Number : Any number which is divisible by 1 and itself. The number should contains exact 2 different factors.
public class PrimeNumber {
	public static void main(String[] args) {
		int num = 7;
		if (isPrime(num))
			System.out.println("Prime Number");
		else
			System.out.println("Composite Number");

	}

	public static boolean isPrime(int num) {
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count == 2)
			return true;
		else
			return false;
	}
}
