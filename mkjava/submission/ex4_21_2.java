import java.util.Scanner;

class ex4_21_2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
	
		int n;
		do{
		System.out.print("n�i�̉E�㒼�p�O�p�`��*�Ŏ����܂��Bn�̒l�� : ");
		n = stdIn.nextInt();
		}while(n <= 0);
		
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= n; j++){
				if(j < i){
					System.out.print(" ");
				}else{	
					System.out.print("*");
				}	
			}
			System.out.println();
		}	
	}
}		