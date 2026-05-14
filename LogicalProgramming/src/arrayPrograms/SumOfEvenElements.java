package arrayPrograms;

//WAJP to print sum of all Even array Elements
public class SumOfEvenElements {
	public static void main(String[] args) {
		int[] a = { 10, 13, 15, 17, 20, 33, 50 };
		int evenElementSum = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				evenElementSum += a[i];
			}
		}
		System.out.println("Sum of Even Elements : " + evenElementSum);
	}
}
