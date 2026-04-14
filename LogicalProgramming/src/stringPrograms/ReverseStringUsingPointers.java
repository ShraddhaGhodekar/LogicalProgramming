package stringPrograms;

public class ReverseStringUsingPointers {
	public static void main(String[] args) {
		String s = "Shraddha";
		System.out.println(getRev(s, 0, s.length() - 1));
	}

	public static char[] getRev(String s, int start, int end) {
		char[] c = s.toCharArray();
		while (start < end) {
			char temp = c[start];
			c[start] = c[end];
			c[end] = temp;
			start++;
			end--;
		}
		return c;
	}
}
