package patterns.com;

public class Pattern4 {
	/*  1
	 *  2 2 
	 *  3 3 3
	 *  4 4 4 4 
	 *  5 5 5 5 5
	 */
	public static void main(String[] args) {
		for(int j=1; j<=5;j++) {
		for(int i=1; i<=j; i++) {
			System.out.print(j+" ");
		}
		System.out.println();
		}
	}

}
