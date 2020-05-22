import java.util.Scanner;

class ex4_20 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
	
		int n;
		do{
		System.out.print("n段の正方形を*で示します。nの値は : ");
		n = stdIn.nextInt();
		}while(n <= 0);
		
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= n; j++){
				System.out.print("*");
			}
			System.out.println();
		}	
	}
}		