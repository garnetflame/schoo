//�����l����͂����̐�Βl�����߂�v���O����

import java.util.Scanner;

class ex3_3 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
	
		System.out.print("�����l : ");
		int n = stdIn.nextInt();
		
		if(n > 0)
			System.out.println("���̒l�͐��ł��B");
		else if (n < 0)
			System.out.println("���̒l�͕��ł��B");
		else if (n == 0)								//if( n==0)�����Ă݂�Ƃǂ��Ȃ邩�H
			System.out.println("���̒l��0�ł��B");     //���Ȃ��ғ��������A
	}
}		