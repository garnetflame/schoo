import java.util.Scanner;

class ex6_16 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		
		System.out.println("�s��a");
		int[][] a = new int[4][3]; //4�s3��̍s��
		for(int i = 0; i < 4 ; i++){
			for(int j = 0; j < 3 ; j++){
				System.out.print("a[" + i + "][" + j + "] = ");
				a[i][j] = stdIn.nextInt();
				System.out.println();
			}
		}	
		
		System.out.println("�s��b");
		int[][] b = new int[3][4]; //3�s4��̍s��
		for(int i = 0; i < 3 ; i++){
			for(int j = 0; j < 4 ; j++){
				System.out.print("b[" + i + "][" + j + "] = ");
				b[i][j] = stdIn.nextInt();
				System.out.println();
			}
		}
		
		int[][] c = {{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
		
		for(int i = 0 ; i < 4 ; i++){
			for(int j = 0 ; j < 4 ; j++ ){
				c[i][j] = a[i][0]*b[0][j] + a[i][1]*b[1][j] + a[i][2]*b[2][j];
			}
		}	
		
		//�s���\������
	
		System.out.println("�s��a");
		for(int i = 0; i < 4 ; i++){
			for(int j = 0; j < 3 ; j ++){
					System.out.printf("%3d" ,a[i][j]);
			}
			System.out.println();
		}
	
		System.out.println("�s��b");
		for(int i = 0; i < 3 ; i++){
			for(int j = 0; j < 4 ; j ++){
					System.out.printf("%3d" ,b[i][j]);
			}
				System.out.println();
		}
		
		System.out.println("�s��c");
		for(int i = 0; i < 4 ; i++){
			for(int j = 0; j < 4 ; j ++){
					System.out.printf("%3d" ,c[i][j]);
			}
			System.out.println();
		}
	}	
}
	