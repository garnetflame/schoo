//�����l����͂����̐�Βl�����߂�v���O����

import java.util.Scanner;

class ex3_1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
	
		System.out.print("�����l : ");
		int n = stdIn.nextInt();
		
		if(n >= 0)
			System.out.println("���̐�Βl��" + n + "�ł��B");
		else
			System.out.println("���̐�Βl��" + (-n) + "�ł��B");
	}
}		