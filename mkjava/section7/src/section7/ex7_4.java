import java.util.Scanner;

public class ex7_4 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("1からnまでの全整数の和を求めます");
		System.out.print("nの値 : ");
		int n = stdIn.nextInt();

		int sum = sumUp(n);
		System.out.println("合計の和は" + sum + "です");

	}
	
	public static int sumUp(int n) {
		int sum = 0;
		for(int i = 1; i <= n; i++) {
		sum += i;
		}
		return sum;
	}
}
