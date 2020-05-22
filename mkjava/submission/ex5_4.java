import java.util.Scanner;

class ex5_4{

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
	
		System.out.println("3つの整数を合計します。");
		System.out.println("3つの整数の平均を求めます。");
		System.out.print("整数 a : ");
		int a = stdIn.nextInt();
		System.out.print("整数 b : ");
		int b = stdIn.nextInt();
		System.out.print("整数 c : ");
		int c = stdIn.nextInt();
		
		double sum = a + b + c;
		double average = sum / 3.0;
		System.out.println("合計は" + sum + "です。");
		System.out.println("平均は" + average + "です。");
	}	
}		