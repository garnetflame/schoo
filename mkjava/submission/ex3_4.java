//�����l����͂����̐�Βl�����߂�v���O����

import java.util.Scanner;

class ex3_4 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
	
		System.out.print("�����la : ");
		int a = stdIn.nextInt();
		
		System.out.print("�����lb : ");
		int b = stdIn.nextInt();
		
		if(a > b)
			System.out.println("a�̕����傫���ł��B");
		else if(a < b)
			System.out.println("b�̕����傫���ł��B");
		else
			System.out.println("a��b�͓����l�ł��B");
	}
}		