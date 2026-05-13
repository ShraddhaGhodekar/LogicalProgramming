package numberPrograms;

//Palindrome --> Given number should be equals to it’s reversed number.
public class PalindromeNumber {
	public static void main(String[] args) {
		int num = 1221;
		if (num == getReverse(num))
			System.out.println("Palindrome Number");
		else
			System.out.println("Not Palindrome Number");
	}

	public static int getReverse(int num) {
		int rev = 0;

		while (num > 0) {
			int lastDigit = num % 10;
			rev = rev * 10 + lastDigit;
			num = num / 10;
		}
		return rev;
	}
}
