import java.util.Scanner;
import java.util.Random;

class Exercise4_2{
	public static void main(String[] args){
		
		Scanner stdIn=new Scanner(System.in);
		Random rand =new Random();
		
		int no=rand.nextInt(90)+10;
		int n;
		
		System.out.println("�����ăQ�[��");
		
		do{
			System.out.print("10�`99�̐�������͂��Ă��������B");
			n=stdIn.nextInt();
		
			if (no>n)
			System.out.println("�����Ƒ傫�Ȑ��ł��B");
			else if (no<n)
			System.out.println("�����Ə����Ȑ��ł��B");
		}
		while (no != n);
		
		System.out.println("�����ł��B���߂łƂ��������܂��B");
	}
}
