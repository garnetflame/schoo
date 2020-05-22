import java.util.Scanner;
public class ex7_9 {
	static Scanner stdIn = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		int n = 0;
		readPlasInt(n);
	}
	
	public static int readPlasInt(int n) {
		do {
			System.out.print("正の整数値 : ");
			n = stdIn.nextInt();
		}while(n<=0);
		return n;
	}

}
