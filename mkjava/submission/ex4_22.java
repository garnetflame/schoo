import java.util.Scanner;

class ex4_22 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
	
		int n;
		do{
		System.out.print("n�i�̐����s���~�b�h��*�ŕ\������n�̒l : ");
		n = stdIn.nextInt();
		}while(n <= 0);
		
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= (n - 1) * 2 + 1; j++){
				if(j <= n - i || j >= n + i){
					System.out.print(" ");
				}else{	
					System.out.print("*");
				}	
			}
			System.out.println();
		}	
	}
}		