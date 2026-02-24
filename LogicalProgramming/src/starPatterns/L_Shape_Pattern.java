package starPatterns;

public class L_Shape_Pattern {
     public static void main(String[] args) {
		int n = 4;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(j==1 || i==n) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
}
