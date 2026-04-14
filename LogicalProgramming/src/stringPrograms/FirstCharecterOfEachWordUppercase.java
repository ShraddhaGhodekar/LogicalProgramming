package stringPrograms;

public class FirstCharecterOfEachWordUppercase {
	public static void main(String[] args) {
		String s = "i love string programming";
		String result = "";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (i == 0 || s.charAt(i - 1) == ' ') {
				c = Character.toUpperCase(c);
			}
			result = result + c;
		}
		System.out.println(result);
	}

}
