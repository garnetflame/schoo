//２つの実数値を読み込んで三角形の面積を計算
import java.util.Scanner;

class ex2_6{
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("三角形の面積を求めます。");
		
		System.out.print("底辺 : "); //底辺の値の入力を促す
		double x = stdIn.nextDouble(); //xに実数値を読み込む
		
		System.out.print("高さ : "); //高さの値の入力を促す
		double y = stdIn.nextDouble(); //yに実数値を読み込む
		
		System.out.println("面積は" + (x * y/2)  + "です。");
	}
}		