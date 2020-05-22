import java.util.Scanner;

class ex6_8 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("要素数 : ");
		int n = stdIn.nextInt();
		double[] a = new double[n];
		
		System.out.println(n + "個の要素の値を入力せよ。");
		for (int i = 0; i < n; i++ ){
			System.out.print("a[" + i + "] = ");
			a[i] = stdIn.nextDouble();
		}
		
		double sum = 0;
		double ave = 0;
		for( double i : a){
			sum += i;
		}
		ave = sum/n;
		System.out.println("合計値は" + sum + "です。");
		System.out.println("平均値は" + ave + "です。");
	}	
}		