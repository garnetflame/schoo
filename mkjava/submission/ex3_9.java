//整数値を入力しその絶対値を求めるプログラム

import java.util.Scanner;

class ex3_9 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
	
		System.out.print("実数値a : ");
		double a = stdIn.nextDouble();
		
		System.out.print("実数値b : ");
		double b = stdIn.nextDouble();
		
		double max = a > b ? a : b; // 大きい方の値
			System.out.println("大きい方の値は" + max + "です。");
	}
}		