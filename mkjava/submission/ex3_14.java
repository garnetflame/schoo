import java.util.Scanner;

class ex3_14 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
	
		System.out.print("�����la : ");
		int a = stdIn.nextInt();
		
		System.out.print("�����lb : ");
		int b = stdIn.nextInt();
		
		int min, max;
		
		if(a != b){
			if(a < b){
				min = a;
				max = b;
			}else{
				min = b;
				max = a;
			}
			System.out.println("���������̒l��" + min + "�ł��B");
			System.out.println("�傫�����̒l��" + max + "�ł��B");
		}	
		else{	
			System.out.println("��̒l�͓����ł��B");
		}	
	}
}		