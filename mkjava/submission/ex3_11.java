//�����l����͂����̐�Βl�����߂�v���O����

import java.util.Scanner;

class ex3_11 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
	
		System.out.print("�����la : ");
		int a = stdIn.nextInt();
		
		System.out.print("�����lb : ");
		int b = stdIn.nextInt();
		
		int gap = a > b ? (a - b) : (b - a);
		
		if(gap <= 10)
			System.out.println("�����̍���10�ȉ��ł��B");
		else
			System.out.println("�����̍���11�ȏ�ł��B");
		
	}
}		