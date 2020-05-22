
import java.util.Scanner;

class ex4_9 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
	
		int n;
		do{
			System.out.print("n‚Ì’l : ");
			n = stdIn.nextInt();
			
		}while(n <= 0);
		
		int product = 1;	//‡Œv‚ÌÏ
		int i = 1;
		
		while (i <= n){
			product *= i;
			i ++;
		}
		System.out.println("1‚©‚ç" + n + "‚Ü‚Å‚ÌÏ‚Í" + product + "‚Å‚·B");
	}
}		