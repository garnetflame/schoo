import java.util.Scanner;

class ex6_17 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int suma = 0;
		double avea = 0;
		int sumb = 0;
		double aveb = 0;
		
		System.out.println("6�l�̍���̓_��");
		int[][] a = new int[2][3]; //2�s3��̍s�񍑌�
		for(int i = 0; i < 2 ; i++){
			for(int j = 0; j < 3 ; j++){
				System.out.print("a[" + i + "][" + j + "] = ");
				a[i][j] = stdIn.nextInt();
				System.out.println();
				suma += a[i][j];
				System.out.println();
			}
		}
		avea = suma / 6;
		System.out.println("6�l�̍���̕��ϓ_��" + avea + "�ł��B");
		
		System.out.println("6�l�̐��w�̓_��");
		int[][] b = new int[2][3]; //2�s3��̍s�񐔊w
		for(int i = 0; i < 2 ; i++){
			for(int j = 0; j < 3 ; j++){
				System.out.print("b[" + i + "][" + j + "] = ");
				b[i][j] = stdIn.nextInt();
				System.out.println();
				sumb += b[i][j];
				System.out.println();
			}
		}
		aveb = sumb / 6;
		System.out.println("6�l�̐��w�̕��ϓ_��" + aveb + "�ł��B");
		
		double[][] c = {{0,0,0},{0,0,0}};//���v
		
		for(int i = 0 ; i < 2 ; i++){
			for(int j = 0 ; j < 3 ; j++ ){
				c[i][j] = (a[i][j] + b[i][j]) / 2.0 ;
			}
		}	
		
		//�s���\������
	
		System.out.println("6�l�̍���̓_���̍s��");
		for(int i = 0; i < 2 ; i++){
			for(int j = 0; j < 3 ; j ++){
					System.out.printf("%4d" ,a[i][j]);
			}
			System.out.println();
		}
	
		System.out.println("6�l�̐��w�̓_���̍s��");
		for(int i = 0; i < 2 ; i++){
			for(int j = 0; j < 3 ; j ++){
					System.out.printf("%4d" ,b[i][j]);
			}
				System.out.println();
		}
		
		System.out.println("6�l�̍���Ɛ��w�̓_���̕���");
		for(int i = 0; i < 2 ; i++){
			for(int j = 0; j < 3 ; j ++){
					System.out.printf("%4.1f" ,c[i][j]);
			}
			System.out.println();
		}
	}	
}
	