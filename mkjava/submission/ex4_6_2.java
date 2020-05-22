//整数値を入力しその絶対値を求めるプログラム

import java.util.Scanner;

class ex4_6_2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
	
		System.out.print("何個*を表示しますか : ");
		int n = stdIn.nextInt();
		
		int i = 1;
		
		while(i <= n){
			System.out.print('*');
			i++;
		}	
		if(n > 1){
			System.out.println();
		}	
	}
}		