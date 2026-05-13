package numberPrograms;
//Spy Number --> Sum of digits is equals to product of digits.
public class SpyNumberOrNot {
	public static void main(String[] args) {
		int num = 123;
		int sum = 0;
		int product = 1;

		while (num > 0) {
			int lastDigit = num % 10;
			sum = sum + lastDigit;
			product = product * lastDigit;
			num = num / 10;
		}
		if (sum == product) {
			System.out.println("Spy Number");
		} else {
			System.out.println("Not Spy Number");
		}
	}
}
