//�����l����͂����̐�Βl�����߂�v���O����

import java.util.Scanner;

class ex3_8 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
	
		System.out.print("�_�� : ");
		int n = stdIn.nextInt();
		
		if(n >= 0 && n <= 100)
			if(n >= 0 && n <= 59)
				System.out.println("�s��");
			else if(n >= 60 && n <= 69)
				System.out.println("��");
			else if(n >= 70 && n <= 79)
				System.out.println("��");
			else 
				System.out.println("�D");
		else
			System.out.println("�������l����͂��Ă��������B");
	}
}		