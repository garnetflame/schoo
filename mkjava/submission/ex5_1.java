//整数値を入力しその絶対値を求めるプログラム

import java.util.Scanner;

class ex5_1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
	
		System.out.println("10進整数を8進数と16進数で表します。");
		int x;
		do{
			System.out.print("正の整数値 : ");
			x = stdIn.nextInt();
		}while(x <= 0);
		
		System.out.printf("8進数ではx = %oです。\n", x);
		System.out.printf("16進数ではx = %xです。\n", x);
		
	}
}		