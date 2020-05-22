//整数値を入力しその中央値を求めプログラム

import java.util.Scanner;

class ex3_13 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
	
		System.out.print("整数a : ");
		int a = stdIn.nextInt();
		
		System.out.print("整数b : ");
		int b = stdIn.nextInt();
		
		System.out.print("整数c : ");
		int c = stdIn.nextInt();
		
		int median;
		if(a >= b && a <= c || a <= b && a >= c)
		median = a;
		else if(b >= a && b <= c || b <=a && b >=c)
		median = b;
		else
		median = c;
		
		System.out.println("中央値は" + median + "です。");
		
	}
}		