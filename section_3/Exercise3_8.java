import java.util.Scanner;

class Exercise3_8{
	public static void main(String[] args){
		
		Scanner stdIn=new Scanner(System.in);
		
		System.out.print("�_���F");
		int a=stdIn.nextInt();
		
		System.out.print("����F");
		
		if (a>=0)
		if (a>=0 && a<=59)
		System.out.println("�s��");
		else if (a>=60 && a<=69)
		System.out.println("��");
		else if (a>=70 && a<=79)
		System.out.println("��");
		else if (a>=80 && a<=100)
		System.out.println("�D");
		else
		System.out.println("���łȂ��l�����͂���܂����B");
		
	}
}