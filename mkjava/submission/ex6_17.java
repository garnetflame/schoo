import java.util.Scanner;

class ex6_17 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int suma = 0;
		double avea = 0;
		int sumb = 0;
		double aveb = 0;
		
		System.out.println("6人の国語の点数");
		int[][] a = new int[2][3]; //2行3列の行列国語
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
		System.out.println("6人の国語の平均点は" + avea + "です。");
		
		System.out.println("6人の数学の点数");
		int[][] b = new int[2][3]; //2行3列の行列数学
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
		System.out.println("6人の数学の平均点は" + aveb + "です。");
		
		double[][] c = {{0,0,0},{0,0,0}};//合計
		
		for(int i = 0 ; i < 2 ; i++){
			for(int j = 0 ; j < 3 ; j++ ){
				c[i][j] = (a[i][j] + b[i][j]) / 2.0 ;
			}
		}	
		
		//行列を表示する
	
		System.out.println("6人の国語の点数の行列");
		for(int i = 0; i < 2 ; i++){
			for(int j = 0; j < 3 ; j ++){
					System.out.printf("%4d" ,a[i][j]);
			}
			System.out.println();
		}
	
		System.out.println("6人の数学の点数の行列");
		for(int i = 0; i < 2 ; i++){
			for(int j = 0; j < 3 ; j ++){
					System.out.printf("%4d" ,b[i][j]);
			}
				System.out.println();
		}
		
		System.out.println("6人の国語と数学の点数の平均");
		for(int i = 0; i < 2 ; i++){
			for(int j = 0; j < 3 ; j ++){
					System.out.printf("%4.1f" ,c[i][j]);
			}
			System.out.println();
		}
	}	
}
	