import java.util.Scanner;

class ex4_21_3 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
	
		int n;
		do{
		System.out.print("n段の右下直角三角形を*で示します。nの値は : ");
		n = stdIn.nextInt();
		}while(n <= 0);
		
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= n; j++){
				if(j <= (5 - i)){
					System.out.print(" ");
				}else{	
					System.out.print("*");
				}	
			}
			System.out.println();
		}	
	}
}		