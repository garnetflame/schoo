import java.util.Scanner;

public class ex7_12 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数 : ");
		int x = stdIn.nextInt();
		System.out.print("シフトするビット数 : ");
		int n = stdIn.nextInt();
		
		System.out.print(  "整数    = ");printBits(x);
		System.out.print("\nx <<  n = ");lRotate(x,n);
		System.out.print("\nx >>  n = ");rRotate(x,n);
		System.out.print("\nx >>> n = ");printBits(x >>> n);
		System.out.println();
	}
		 
	public static void printBits(int x) {
		for(int i = 31 ; i >= 0; i--) {
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
		}
	}
	public static int rRotate(int x ,int n) {
		for(int i = 31 ; i >= 0; i--) {
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
			if(i >= 1) {
			System.out.print(((x << (32 - i) & 1) == 1) ? '1' : '0');
			}
		}
		return x;
	}
	public static int lRotate(int x ,int n) {
		for(int i = 31 ; i >= 0; i--) {
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
			if(i >= 1) {
			System.out.print(((x << (32 - i) & 1) == 1) ? '1' : '0');
			}
		}
		return x;
	}
}
