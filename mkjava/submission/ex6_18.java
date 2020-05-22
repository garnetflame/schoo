import java.util.Scanner;

class ex6_18 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		int[][] c;
		
		do{
		System.out.print("çsêî : ");
		a = stdIn.nextInt();
		}while(a <= 0);
		c = new int[a][];
		
		for(int i = 0; i < a ; i++){
			do{
			System.out.print("c["+ i +"]ÇÃóÒêî : ");
			b = stdIn.nextInt();
			}while(b <= 0);	
			c[i] = new int[b];
			System.out.println("c["+ i +"] = new int["+ b +"] ");
		}
		
		for(int i = 0; i < c.length ; i++){	
			for(int j = 0; j < c[i].length; j++){
				System.out.print("a[" + i + "][" + j + "] = ");
				c[i][j] = stdIn.nextInt();
				System.out.println();
			}
		}
		
		for(int i = 0; i < c.length; i++){
			for(int j = 0; j < c[i].length; j++){
				System.out.printf("%3d", c[i][j]);
			}
			System.out.println();
		}	
	}	
}
	