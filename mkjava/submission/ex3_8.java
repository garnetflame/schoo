//整数値を入力しその絶対値を求めるプログラム

import java.util.Scanner;

class ex3_8 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
	
		System.out.print("点数 : ");
		int n = stdIn.nextInt();
		
		if(n >= 0 && n <= 100)
			if(n >= 0 && n <= 59)
				System.out.println("不可");
			else if(n >= 60 && n <= 69)
				System.out.println("可");
			else if(n >= 70 && n <= 79)
				System.out.println("良");
			else 
				System.out.println("優");
		else
			System.out.println("正しい値を入力してください。");
	}
}		