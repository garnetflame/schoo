//整数値を入力しその絶対値を求めるプログラム

import java.util.Scanner;

class ex3_3 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
	
		System.out.print("整数値 : ");
		int n = stdIn.nextInt();
		
		if(n > 0)
			System.out.println("その値は正です。");
		else if (n < 0)
			System.out.println("その値は負です。");
		else if (n == 0)								//if( n==0)をつけてみるとどうなるか？
			System.out.println("その値は0です。");     //問題なく稼働したが、
	}
}		