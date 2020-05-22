import java.util.Scanner;

class ex4_23 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
	
		int n;
		do{
		System.out.print("n段の数字ピラミッドを数字で表示するnの値 : ");
		n = stdIn.nextInt();
		}while(n <= 0);
		
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= (n - 1) * 2 + 1; j++){
				if(j <= n - i || j >= n + i){
					System.out.print(" ");
				}else if(i <= 9){	
					System.out.print(i);
				}else if(i >= 10){
					int t = i % 10;
					System.out.print(t);
				}
			}	
			System.out.println();
		}	
	}
}		