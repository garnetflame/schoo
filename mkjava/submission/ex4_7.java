//整数値を入力しその絶対値を求めるプログラム

import java.util.Scanner;

class ex4_7 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
	
		System.out.print("何個*と+を交互に表示しますか : ");
		int n = stdIn.nextInt();
		
		int i = 0;
		
		do{
			if(i % 2 == 1)
			System.out.print('+');
			else
			System.out.print('*');
			i++;
		}while(i < n);
	}
}		