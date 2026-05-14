package arrayPrograms;

//WAJP to print sum of all Odd array Elements
public class SumOfOddElements {
	public static void main(String[] args) {
		int[] a = { 10, 13, 15, 17, 20, 33, 50 };
		int oddElementSum = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				oddElementSum += a[i];
			}
		}
		System.out.println("Sum of Odd Elements : " + oddElementSum);
	}
}
