package arrayPrograms;

//WAJP to Print Even Element from an array ?
public class EvenIndexElementsFromArray {
	public static void main(String[] args) {
		int[] a = { 5, 10, 3, 7, 9, 12 };

		for (int i = 0; i < a.length; i++) {
			if (i % 2 == 0) {
				System.out.println(a[i]);
			}
		}
	}
}
