import java.util.Scanner;

class ex6_19 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		int sumx = 0;
		int sumall = 0;
		double aveall = 0;
		int[] sum;
		double[] ave;
		
		System.out.print("�N���X�� : ");
		int n = stdIn.nextInt();
		System.out.println();
		System.out.println();
		
		sum = new int[n];
		ave = new double[n];
		
		for(int i = 0; i < n ; i++){
			System.out.print((i+1) + "�g�̐l�� : ");
			a = stdIn.nextInt();
			System.out.println();
			for(int j = 1; j <= a ; j++){
				System.out.print((i+1) + "�g" + j + "�Ԃ̓_�� : ");
				b = stdIn.nextInt();
				System.out.println();
				sumx += b;
			}
			sum[i] = sumx; 
			sumx = 0;
			ave[i] = (double)sum[i] / a;
			sumall += sum[i];
			aveall += ave[i];
		System.out.println();
		}
		
		System.out.println("  �g  |    ���v     ����  ");
		System.out.println("------+-------------------");
		for(int i = 0 ; i < n ; i++){
			System.out.printf("%2d�g  |     %3d      %3.1f\n" ,i+1,sum[i],ave[i]);
		}
		System.out.println("------+-------------------");
		System.out.printf("  �v  |     %3d      %3.1f\n " ,sumall,aveall/n);
	}	
}
	