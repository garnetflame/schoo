//整数値を入力しその絶対値を求めるプログラム

import java.util.Scanner;

class ex3_11 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
	
		System.out.print("整数値a : ");
		int a = stdIn.nextInt();
		
		System.out.print("整数値b : ");
		int b = stdIn.nextInt();
		
		int gap = a > b ? (a - b) : (b - a);
		
		if(gap <= 10)
			System.out.println("それらの差は10以下です。");
		else
			System.out.println("それらの差は11以上です。");
		
	}
}		