package arrayPrograms;

//WAJP to Print Odd Element from an array ?
public class OddElementsFromArray {
	public static void main(String[] args) {
		int[] a = { 5, 10, 3, 7, 9, 12 };

		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				System.out.println(a[i]);
			}
		}
	}
}
