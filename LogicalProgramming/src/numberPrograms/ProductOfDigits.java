package numberPrograms;

public class ProductOfDigits {
	public static void main(String[] args) {
		int num = 123;
		int product = 1;

		while (num > 0) {
			int lastDigit = num % 10;
			product = product * lastDigit;
			num = num / 10;
		}
		System.out.println("Product of Digits : " + product);
	}
}
