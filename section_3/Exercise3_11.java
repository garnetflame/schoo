import java.util.Scanner;

class Exercise3_11{
	public static void main(String[] args){
		
		Scanner stdIn=new Scanner(System.in);
		
		System.out.print("����A�F");
		int a=stdIn.nextInt();
		
		System.out.print("����B�F");
		int b=stdIn.nextInt();
		
		int x=a>b ? a-b:b-a;
		System.out.println("�����̒l�̍���"+(x>=10 ? "�����̍���11�ȏ�ł��B":"�����̍���10�ȉ��ł�"));
		
	}
}