
import java.util.Scanner;

class ex4_9 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
	
		int n;
		do{
			System.out.print("nの値 : ");
			n = stdIn.nextInt();
			
		}while(n <= 0);
		
		int product = 1;	//合計の積
		int i = 1;
		
		while (i <= n){
			product *= i;
			i ++;
		}
		System.out.println("1から" + n + "までの積は" + product + "です。");
	}
}		