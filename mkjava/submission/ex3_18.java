import java.util.Scanner;

class ex3_18 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
	
		System.out.print("�� : ");
		int a = stdIn.nextInt();
		
		switch(a){
			case 1 : 
			case 2 :
			case 12 : System.out.println("�~�ł��B");
					break;
			case 3 :
			case 4 :
			case 5 : System.out.println("�t�ł��B");
					break;
			case 6 :
			case 7 :
			case 8 : System.out.println("�Ăł��B");
					break;
			case 9 : 
			case 10 :
			case 11 : System.out.println("�H�ł��B");
					break;
			default : System.out.println("���������Ɉ�v���܂���B");
					break;
			
		}
	}
}		