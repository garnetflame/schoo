//�����l����͂����̐�Βl�����߂�v���O����

import java.util.Scanner;

class ex3_7practice {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
	
		System.out.print("���̐����l : ");
		int n = stdIn.nextInt();
		
		if(n > 0)
			if(n % 3 == 0)
				System.out.println("���̒l��3�Ŋ���؂�܂��B");
			else if(n % 3 == 1)
				System.out.println("���̒l��3�Ŋ������]���1�ł��B");
			else if(n % 3 == 2)
				System.out.println("���̒l��3�Ŋ������]���2�ł��B");
		else if(n <=0)
			System.out.println("���łȂ��l�����͂���܂����B"); //���s����܂���ł���
	}
}		