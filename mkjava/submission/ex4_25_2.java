import java.util.Scanner;

class ex4_25_2{

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
	
		System.out.println("���������Z���܂��B");
		System.out.println("���ς����߂܂��B");
		System.out.print("�����Z���܂��� : ");
		int n = stdIn.nextInt();
		
		double sum = 0;
		double average = 0;
		for(int i = 1; i <= n; i++){
			System.out.print("���� : "); 
			int t = stdIn.nextInt();
			if(sum + t > 1000){
				System.out.println("���v��1000�����܂����B");
				System.out.println("�Ō�̒l�͖������܂��B");
				break;
			}	
			sum += t;
			average = sum / i; 
		}	
			System.out.println("���v��" + sum + "�ł��B");
			System.out.println("���ς�" + average + "�ł��B");
	}	
}		