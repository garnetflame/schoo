import java.util.Scanner;

class ex6_6 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�l��  : ");
		int n = stdIn.nextInt();
		
		int[] tensu =new int[n];
		
		System.out.println(n + "�l�̓_������͂���B");
		for(int i = 0; i < n ; i++){
			System.out.print((i + 1) + "�Ԃ̓_�� :");
			tensu[i] = stdIn.nextInt();
		}
		int max = tensu[0];
		int min = tensu[0];
		int sum = 0;
		double ave = 0;
		for(int i = 1 ; i < tensu.length; i++){
		sum += tensu[i];
		if(tensu[i] > max) max = tensu[i];
		if(tensu[i] < min) min = tensu[i];
		}
		ave = (double)sum / n;
		System.out.println("�ō��_��" + max + "�_�ł��B");
		System.out.println("�Œ�_��" + min + "�_�ł��B");
		System.out.println("���ϓ_��" + ave + "�_�ł��B");
	}
}		