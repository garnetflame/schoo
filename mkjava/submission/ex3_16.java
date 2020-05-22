import java.util.Scanner;

class ex3_16 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
	
		System.out.print("変数a : ");
		int a = stdIn.nextInt();
		
		System.out.print("変数b : ");
		int b = stdIn.nextInt();
		
		System.out.print("変数c : ");
		int c = stdIn.nextInt();
		
		if (a > b){
			int t = a;
			a = b;
			b = t;
		}
		if (a > c){
			int s = a;
			a = c;
			c = s;
		}
		if (b > c){
			int u = b;
			b = c;
			c = u;
		}
			
			System.out.println("a≧b≧cとなるようにソートしました。");
			System.out.println("変数aの値は" + a + "です。");
			System.out.println("変数bの値は" + b + "です。");	
			System.out.println("変数cの値は" + c + "です。");	
	}
}		