package numberPrograms;

//Factors --> Factors are the numbers which divides the given number
//completely without leaving any remainder.
public class FactorsOfNumber {
	public static void main(String[] args) {
		int num = 6;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.println(i);
			}
		}
	}
}
