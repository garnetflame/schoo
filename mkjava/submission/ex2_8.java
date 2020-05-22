import java.util.Scanner;
import java.util.Random;

class ex2_8{
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("xとyを加減乗除します。");
		
		System.out.print("整数値 : "); //xの値の入力を促す
		int x = stdIn.nextInt(); //xに整数値を読み込む
		
		int y = rand.nextInt(11) -5 ; //-5～5までの乱数
		
		System.out.println("その値の±5の乱数を生成しました。それは" + (x + y) + "です。");
	}
}		