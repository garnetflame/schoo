//����

import java.util.Random;
import java.util.Scanner;

class ex4_2 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		int no = rand.nextInt(90) + 10;	//10�ȏ�100�����̗���	
		
		
		System.out.println("�����ăQ�[���J�n!! ");
		System.out.println("10�`99�̐��𓖂ĂĂ��������B ");
		
		int x; //�v���C���[������
		do {
			System.out.print("�������� : ");
			x = stdIn.nextInt();
			
			if(x > no)
				System.out.println("�����������Ȑ�����B");
			else if (x < no)
				System.out.print("�����Ƒ傫�Ȑ�����B");
		} while (x != no);
		
		System.out.println("�����ł��B");
	}
}		
		