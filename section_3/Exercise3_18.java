import java.util.Scanner;

class Exercise3_18{
	public static void main(String[] args){
		
		Scanner stdIn=new Scanner(System.in);
		
		System.out.print("�����H�F");
		int a=stdIn.nextInt();
		
		
		switch (a){
			case 3:
			case 4:
			case 5: System.out.println("�t�ł�"); break;
			case 6:
			case 7:
			case 8: System.out.println("�Ăł�"); break;
			case 9: 
			case 10:
			case 11: System.out.println("�H�ł�"); break;
			case 12:
			case 1: 
			case 2: System.out.println("�~�ł�"); break;
			default: System.out.println("1�`12�̐�������͂��Ă�������"); break;
		}
		
	}
}