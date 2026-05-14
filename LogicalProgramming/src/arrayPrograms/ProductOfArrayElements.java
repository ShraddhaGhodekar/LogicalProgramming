package arrayPrograms;

////WAJP to print Product of all array Elements
public class ProductOfArrayElements {
	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 40, 50 };
		int product = 1;
		for (int i = 0; i < a.length; i++) {
			product = product * a[i];
		}
		System.out.println("Product of Array Elements : " + product);
	}
}
