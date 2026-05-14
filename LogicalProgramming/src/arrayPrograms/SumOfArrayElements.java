package arrayPrograms;

//WAJP to print sum of all array Elements
public class SumOfArrayElements {
	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 40, 50 };
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println("Sum of Array Elements : " + sum);
	}
}
