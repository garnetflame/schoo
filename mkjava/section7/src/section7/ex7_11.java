import java.util.Scanner;

public class ex7_11 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数 : ");
		int x = stdIn.nextInt();
		System.out.print("シフトするビット数 : ");
		int n = stdIn.nextInt();
		
		System.out.print(  "整数    = ");printBits(x);
		System.out.print("\nx <<  n = ");printBits(x <<  n);
		System.out.print("\nx >>  n = ");printBits(x >>  n);
		System.out.print("\nx >>> n = ");printBits(x >>> n);
		System.out.println();
		
		int y = x;
		for(int i = 1; i <= n; i++){
			y = y*2;
		}
		int z = x;
		for(int i = 1; i <= n; i++){
			z = z*1/2;
		}
		
		 if(y == (x << n)){
			System.out.println(x +"を2の"+ n +"乗した値は" + (x << n) +"となります");	
		}
		 if(z == (x >> n)){
				System.out.println(x +"を1/2の"+ n +"乗した値は" + (x >> n) +"となります");	
		 }
	}
		 
	public static void printBits(int x) {
		for(int i = 31 ; i >= 0; i--) {
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
		}
	}
}
