//乱数

import java.util.Random;
import java.util.Scanner;

class ex4_2 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		int no = rand.nextInt(90) + 10;	//10以上100未満の乱数	
		
		
		System.out.println("数当てゲーム開始!! ");
		System.out.println("10～99の数を当ててください。 ");
		
		int x; //プレイヤーが入力
		do {
			System.out.print("いくつかな : ");
			x = stdIn.nextInt();
			
			if(x > no)
				System.out.println("もっち小さな数だよ。");
			else if (x < no)
				System.out.print("もっと大きな数だよ。");
		} while (x != no);
		
		System.out.println("正解です。");
	}
}		
		