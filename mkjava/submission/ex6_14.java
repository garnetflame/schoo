import java.util.Random;
import java.util.Scanner;

class ex6_14 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		String[] monthString = { "January" ,"February" ,"March" ,"April","May","June","July","August","September","October","November","December"};
		
		int retry = 1;
		String x;
		int month = 0;
		int t = 20;
		int flag = 0;
	

		do{
			if(flag == 0){
				do{
					month = rand.nextInt(12); //�o�肳��錎�̐����F0�`11�̗���
				}while(t == month);
			}		
			System.out.print(month + 1);	
			System.out.print("��: ");
			x = stdIn.next();
		
			if(monthString[month].equals(x)){
				System.out.print("�����ł��B");
				System.out.print("������x�H 1�cYes / 0�cNO :");
				retry = stdIn.nextInt();
				if(retry == 1){
				t = month;
				flag = 0;
				continue;
			}else if(retry == 0)break;
			}else{
				System.out.println("�Ⴂ�܂��B");
				flag = 1;	
			}
		}while(retry == 1);
		
		System.out.println("�����l�ł���");
	}	
}		