//�~���̒����Ɖ~�̖ʐς����߂�i�~������final�֐��ŕ\���j

import java.util.Scanner;

class pra2_13{

	public static void main(String[] args) {
		final double PI = 3.1416;		//�~����
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("���a : ");
		double r = stdIn.nextDouble(); //���a
		
		System.out.println("�~���̒�����" + 2 * PI * r + "�ł��B ");
		System.out.println("�ʐς�" +  PI * r * r + "�ł��B ");
	}
}		