//整数値を入力しその絶対値を求めるプログラム

import java.util.Scanner;

class ex3_2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
	
		System.out.print("整数A : ");
		int A = stdIn.nextInt();
		
		System.out.print("整数B : ");
		int B = stdIn.nextInt();
		
		if(A % B == 0)
			System.out.println("BはAの約数です。");
		else
			System.out.println("BはAの約数ではありません。");
	}
}		