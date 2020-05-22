//整数値を入力しその絶対値を求めるプログラム

import java.util.Scanner;

class ex5_2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
	
		System.out.println("変数xはfloat型で、変数yはdouble型です。");
		float x;
		double y;
		
		System.out.print("0以上1未満の実数値: ");
		x = stdIn.nextFloat();
		System.out.print("0以上1未満の実数値: ");
		y = stdIn.nextDouble();
		
		System.out.printf("x = %9.8f\n",x);
		System.out.printf("y = %18.17f\n",y);
	}
}		