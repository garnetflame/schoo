//名前を読み込んで挨拶する
import java.util.Scanner;

class ex2_10{
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("姓 : " );
		String s = stdIn.next();
		
		System.out.print("名 : " );
		String t = stdIn.next();
		
		System.out.println("こんにちは" + s + t + "さん。");
	}
}		