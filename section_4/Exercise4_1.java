import java.util.Scanner;

class Exercise4_1{
	public static void main(String[] args){
		
		Scanner stdIn=new Scanner(System.in);
		
		int retry;
		
		do{
			
			System.out.print("�����l�F");
			int n=stdIn.nextInt();
		
			if (n>0)
			System.out.print("���̒l�͐��ł��B");
			else if (n<0)
			System.out.print("���̒l�͕��ł��B");
			else 
			System.out.print("���̒l��0�ł��B");
			
			System.out.print("������x�H 1�cYes/0�cNo�F");
			retry=stdIn.nextInt();
		}
		while (retry==1);
	}
}
