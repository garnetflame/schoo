//�����l����͂����̐�Βl�����߂�v���O����

import java.util.Scanner;

class ex3_12 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
	
		System.out.print("����a : ");
		int a = stdIn.nextInt();
		
		System.out.print("����b : ");
		int b = stdIn.nextInt();
		
		System.out.print("����c : ");
		int c = stdIn.nextInt();
		
		int min = a;
		if(b < min) 
			min = b;
		if(c < min)
			min = c;
		
		System.out.println("�ŏ��l��" + min + "�ł��B");
		
	}
}		