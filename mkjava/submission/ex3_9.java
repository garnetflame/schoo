//�����l����͂����̐�Βl�����߂�v���O����

import java.util.Scanner;

class ex3_9 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
	
		System.out.print("�����la : ");
		double a = stdIn.nextDouble();
		
		System.out.print("�����lb : ");
		double b = stdIn.nextDouble();
		
		double max = a > b ? a : b; // �傫�����̒l
			System.out.println("�傫�����̒l��" + max + "�ł��B");
	}
}		