import java.util.Scanner;

class ex3_15 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
	
		System.out.print("変数a : ");
		int a = stdIn.nextInt();
		
		System.out.print("変数b : ");
		int b = stdIn.nextInt();
		
		if (a < b){
			int t = a;
			a = b;
			b = t;
		}	
			System.out.println("a≧bとなるようにソートしました。");
			System.out.println("変数aの値は" + a + "です。");
			System.out.println("変数bの値は" + b + "です。");	
	}
}		