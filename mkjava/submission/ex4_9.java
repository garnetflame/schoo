
import java.util.Scanner;

class ex4_9 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
	
		int n;
		do{
			System.out.print("n�̒l : ");
			n = stdIn.nextInt();
			
		}while(n <= 0);
		
		int product = 1;	//���v�̐�
		int i = 1;
		
		while (i <= n){
			product *= i;
			i ++;
		}
		System.out.println("1����" + n + "�܂ł̐ς�" + product + "�ł��B");
	}
}		