import java.util.Scanner;

class Exercise7_6{
	
	static void printSeason(int m){
		
		switch(m){
			case 12:
			case 1:
			case 2:
				System.out.println("�u�~�v");
				break;
			case 3:
			case 4:
			case 5:
				System.out.println("�u�t�v");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("�u�āv");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("�u�H�v");
				break;
		default: break;
		}
	}
	
	public static void main(String[]args){
		
		Scanner stdIn=new Scanner(System.in);
		
		System.out.print("������͂��Ă��������B�F");
		int m=stdIn.nextInt();
		
		printSeason(m);
	}
}