import java.util.Scanner;
import java.util.Random;

class Exercise6_15{
	public static void main(String[]args){
		
		Scanner stdIn=new Scanner(System.in);
		Random rand=new Random();
		
		int flag1=0;
		int flag2=0;
		int number=0;
		
		String []DayE ={"Monday","Tuesday","Wednesday","Thirsday","Friday","Satuaday","Sunday"};
		String []DayJ ={"���j��","�Ηj��","���j��","�ؗj��","���j��","�y�j��","���j��"};
		
		System.out.println("�p��̗j��������͂��Ă��������B\n�Ȃ��A�擪�͑啶���ŁA2�����ڈȍ~�͏������Ƃ��܂��B");
		
	retry:
		while(true){
			if(flag2 != 1){
				number=rand.nextInt(7);
				if(flag1==number){
					continue retry;
				}
			}
			
			System.out.print(DayJ[number]+"�F");
			String m=stdIn.next();
			
			if(!(m.equals(DayE[number]))){
				System.out.println("�Ⴂ�܂��B");
				flag2 = 1;
			}else{
				System.out.println("�����ł��B������x�H�@1�cYes/0�cNo");
				int question=stdIn.nextInt();
				flag1 = number;
				flag2 = 0;
				System.out.println();
				
				if (!(question==1)){
					break;
				}
			}
		}
	}
}