
import java.util.Scanner;

class ex4_15 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
	
		int x;
		int y;
		int z;
		do{
			System.out.print("���p���� : ");
			x = stdIn.nextInt();
			
			System.out.print("���p�܂� : ");
			y = stdIn.nextInt();
			
			System.out.print("���p���� : ");
			z = stdIn.nextInt();
		}while(x <= 0 || y <= 0 || z <= 0);
		
		double w;		//�W���̏d
		
		for(int i = x; i <= y; i += z){
			w = (i - 100) * 0.9;
			System.out.print(i + " ");
			System.out.println(w);				
		}
			
	}	
}		