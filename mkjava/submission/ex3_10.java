//�����l����͂����̐�Βl�����߂�v���O����

import java.util.Scanner;

class ex3_10 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
	
		System.out.print("�����la : ");
		int a = stdIn.nextInt();
		
		System.out.print("�����lb : ");
		int b = stdIn.nextInt();
		
		int gap = a > b ? (a - b) : (b - a);
			System.out.println("��̐����̒l�̍���" + gap + "�ł��B");
	}
}		