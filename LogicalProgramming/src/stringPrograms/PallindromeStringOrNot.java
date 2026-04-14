package stringPrograms;

public class PallindromeStringOrNot {
	public static void main(String[] args) {
		String s = "mam";
		if (s.equals(getRev(s))) {
			System.out.println("String is Pallindrome");
		} else {
			System.out.println("String is not Pallindrome");
		}
	}

	public static String getRev(String s) {
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		return rev;
	}
}
