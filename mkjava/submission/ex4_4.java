//�����l����͂����̐�Βl�����߂�v���O����

import java.util.Scanner;

class ex4_4 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
	
		System.out.println("�J�E���g�_�E�����܂��B");
		int x;
		do{
			System.out.print("���̐����l : ");
			x = stdIn.nextInt();
		}while(x <= 0);
		while (x >= -1){
			System.out.println(x);
			x--;
		}
	}
}		