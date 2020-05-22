//整数値を入力しその絶対値を求めるプログラム

import java.util.Scanner;

class ex4_11 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
	
		System.out.println("カウントダウンします。");
		int x;
		do{
			System.out.print("正の整数値 : ");
			x = stdIn.nextInt();
		}while(x <= 0);
		for(int i = 0; i < x; i++)
			System.out.println(x-i);
	}
}		