//�����l��ǂ݂���

import java.util.Scanner;

class ex2_4{
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�����l : ");
		int a = stdIn.nextInt();  //a�ɐ����l��ǂݍ���
		
		int b = a;				  //a�̒l�ł�b������
		System.out.println("10���������l��" + (b + 10) + "�ł��B");
		System.out.println("10���������l��" + (b - 10) + "�ł��B");
	}
}		