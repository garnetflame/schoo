//�����l����͂����̒����l�����߃v���O����

import java.util.Scanner;

class ex3_13 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
	
		System.out.print("����a : ");
		int a = stdIn.nextInt();
		
		System.out.print("����b : ");
		int b = stdIn.nextInt();
		
		System.out.print("����c : ");
		int c = stdIn.nextInt();
		
		int median;
		if(a >= b && a <= c || a <= b && a >= c)
		median = a;
		else if(b >= a && b <= c || b <=a && b >=c)
		median = b;
		else
		median = c;
		
		System.out.println("�����l��" + median + "�ł��B");
		
	}
}		