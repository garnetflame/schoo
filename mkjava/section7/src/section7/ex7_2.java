import java.util.Scanner;

public class ex7_2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("変数a : ");
		int a = stdIn.nextInt();
		System.out.print("変数b : ");
		int b = stdIn.nextInt();
		System.out.print("変数c : ");
		int c = stdIn.nextInt();
		int min = min(a,b,c);
		System.out.println("最小値は" + min + "です");

	}
	
	public static int min(int a,int b, int c) {
		int min = a;
		if(min > b) {
			min =  b;
		}
		if(min > c) {
			min = c;
		}
		return min;
	}

}
