//整数値を読みこむ

import java.util.Scanner;

class ex2_4{
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数値 : ");
		int a = stdIn.nextInt();  //aに整数値を読み込む
		
		int b = a;				  //aの値でをb初期化
		System.out.println("10を加えた値は" + (b + 10) + "です。");
		System.out.println("10を減じた値は" + (b - 10) + "です。");
	}
}		