//�����l����͂����̐�Βl�����߂�v���O����

import java.util.Scanner;

class ex4_11 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
	
		System.out.println("�J�E���g�_�E�����܂��B");
		int x;
		do{
			System.out.print("���̐����l : ");
			x = stdIn.nextInt();
		}while(x <= 0);
		for(int i = 0; i < x; i++)
			System.out.println(x-i);
	}
}		