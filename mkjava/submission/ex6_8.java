import java.util.Scanner;

class ex6_8 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�v�f�� : ");
		int n = stdIn.nextInt();
		double[] a = new double[n];
		
		System.out.println(n + "�̗v�f�̒l����͂���B");
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
		System.out.println("���v�l��" + sum + "�ł��B");
		System.out.println("���ϒl��" + ave + "�ł��B");
	}	
}		