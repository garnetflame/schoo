
import java.util.Scanner;

class ex4_15 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
	
		int x;
		int y;
		int z;
		do{
			System.out.print("何�pから : ");
			x = stdIn.nextInt();
			
			System.out.print("何�pまで : ");
			y = stdIn.nextInt();
			
			System.out.print("何�pごと : ");
			z = stdIn.nextInt();
		}while(x <= 0 || y <= 0 || z <= 0);
		
		double w;		//標準体重
		
		for(int i = x; i <= y; i += z){
			w = (i - 100) * 0.9;
			System.out.print(i + " ");
			System.out.println(w);				
		}
			
	}	
}		