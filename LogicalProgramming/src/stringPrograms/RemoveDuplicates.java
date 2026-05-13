package stringPrograms;

public class RemoveDuplicates {
	public static void main(String[] args) {
		String s = "abcabxyyaz";
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {
			int count = 0;
			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					count++;
				}
			}
			if (count == 0)
				sb.append(s.charAt(i));
		}
		System.out.println(sb);
	}
}
