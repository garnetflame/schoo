import java.util.Scanner;

public class ex7_7 {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		System.out.println("n個の*を連続して表示します。");
		System.out.print("nの値 : ");
		int n = stdIn.nextInt();

		putStars(n);
	}

	public static void putChars(char c, int n) {
		while (n-- > 0)
			System.out.print(c);
	}

	public static void putStars(int n) {
		putChars('*', n);
		System.out.println();
	}
}
