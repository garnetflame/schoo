import java.util.Random;
import java.util.Scanner;

public class ex7_10 {

	static Scanner stdIn = new Scanner(System.in);

	public static void main(String[] args) {
		Random rand = new Random();
		
		System.out.println("暗記力トレーニング");
		do {
			int x =rand.nextInt(900) +100;
			int y =rand.nextInt(900) +100;
			int z =rand.nextInt(900) +100;
			int w =rand.nextInt(4);
			
			if(w==0) {
			while(true) {
				System.out.print(x + " + " + y + " + " + z + " = ");
				int k = stdIn.nextInt();
				if(k == x + y + z) {
					System.out.println("正解です！！");
					break;
				}
				System.out.println("違いますよ！！");
			}
			}else if(w == 1) {
			while(true) {
				System.out.print(x + " + " + y + " - " + z + " = ");
				int k = stdIn.nextInt();
				if(k == x + y - z) {
					System.out.println("正解です！！");
					break;
				}
				System.out.println("違いますよ！！");
			}
			}else if(w==2){
			while(true) {
				System.out.print(x + " - " + y + " + " + z + " = ");
				int k = stdIn.nextInt();
				if(k == x - y + z) {
					System.out.println("正解です！！");
					break;
				}
				System.out.println("違いますよ！！");
			}
			}else {
			while(true) {
				System.out.print(x + " - " + y + " - " + z + " = ");
				int k = stdIn.nextInt();
				if(k == x - y - z) {
					System.out.println("正解です！！");
					break;
				}
				System.out.println("違いますよ！！");
			}
			}
			
		}while(confirmRetry());
	}

	public static boolean confirmRetry() {
		int cont;
		do {
			System.out.print("もう一度？ <Yes…1/NO…0> : ");
			cont = stdIn.nextInt();
		} while (cont != 1 && cont != 0);
		return cont == 1;
	}

}
