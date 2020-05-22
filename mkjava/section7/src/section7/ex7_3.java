import java.util.Scanner;

public class ex7_3 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("変数a : ");
		int a = stdIn.nextInt();
		System.out.print("変数b : ");
		int b = stdIn.nextInt();
		System.out.print("変数c : ");
		int c = stdIn.nextInt();
		int med = med(a,b,c);
		System.out.println("中央値は" + med + "です");

	}
	
	public static int med(int a,int b, int c) {
		int med ;
		if(a >= b && a<= c || a <= b && a>= c) {
			med =  a;
		}
		else if(b >= a && b <= c || b<= a && b >= c) {
			med = b;
		}else {
			med = c;
		}
		return med;
	}

}
