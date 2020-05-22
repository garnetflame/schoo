//乱数

import java.util.Random;
import java.util.Scanner;

class ex4_27 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		int no = rand.nextInt(100);	//0以上100未満の乱数	
		int limit = rand.nextInt(10) + 1; //制限回数1～10まで
		
		System.out.println("数当てゲーム開始!! ");
		System.out.println("0～99の数を当ててください。 ");
		System.out.println("制限回数は"+ limit + "です。");
		
		int x; //プレイヤーが入力
		int t = 0;
		do {
			System.out.print("いくつかな : ");
			x = stdIn.nextInt();
			
			t++;
			if(t >= limit) break ;
			
			if(x > no){
				System.out.println("もっと小さな数だよ。");
			}else if (x < no){
				System.out.print("もっと大きな数だよ。");
			}
		} while (x != no);
		
		if(t >= limit){
			System.out.println("制限回数を超えました。正解は" + no + "です。");
		}else{	
			System.out.println("正解です。");
		}	
	}
}		
		