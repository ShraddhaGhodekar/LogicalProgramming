package stringPrograms;

public class ReverseString {
	public static void main(String[] args) {
		String s = "Shraddha";
		System.out.println(getRev(s));
	}

	public static String getRev(String s) {
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		return rev;
	}
}
