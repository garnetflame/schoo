//�����l����͂����̐�Βl�����߂�v���O����

import java.util.Scanner;

class ex4_8 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n;
		
		do{
		System.out.print("�����l : ");
		n = stdIn.nextInt();
		}while(n <= 0);
			
		int i = 1;
		
		while(n >= 10){
			n = n / 10;
			i++;
		}
		System.out.println("���̒l��" + i + "���ł��B");
	}	
}		