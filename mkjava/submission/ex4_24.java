import java.util.Scanner;

class ex4_24 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
	
	int n;
		
		do{
		System.out.print("®”’l : ");
		n = stdIn.nextInt();
		}while(n <= 0);	
		
		int t = 0;
		
			for(int i = 1; i <= n; i++){
				if(n % i == 0){
					t++;
				}	
				if(t == 3) break;
			}
			if(t == 2){
				System.out.println(n +"‚Í‘f”‚Å‚·B");
			}else if(t == 1 || t >= 3){	
				System.out.println(n + "‚Í‘f”‚Å‚Í‚ ‚è‚Ü‚¹‚ñB");
			}	
	}	
}		