//�����l����͂����̐�Βl�����߂�v���O����

import java.util.Scanner;

class ex5_2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
	
		System.out.println("�ϐ�x��float�^�ŁA�ϐ�y��double�^�ł��B");
		float x;
		double y;
		
		System.out.print("0�ȏ�1�����̎����l: ");
		x = stdIn.nextFloat();
		System.out.print("0�ȏ�1�����̎����l: ");
		y = stdIn.nextDouble();
		
		System.out.printf("x = %9.8f\n",x);
		System.out.printf("y = %18.17f\n",y);
	}
}		