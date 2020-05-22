//整数値を入力しその絶対値を求めるプログラム

import java.util.Scanner;

class practice4_3 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
	
		System.out.print("整数A : ");
		int A = stdIn.nextInt();
		
		System.out.print("整数B : ");
		int B = stdIn.nextInt();
		
		if(A < B){			//AとBを並び替え、Aの方が大きくする
			int t = A;
			A = B;
			B = t;
		}
		int C = B ;
		
		do{
			System.out.print(C ++ + " ");
		}while(A > C );
	}
}		