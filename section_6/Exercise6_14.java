import java.util.Scanner;
import java.util.Random;

class Exercise6_14{
	public static void main(String[]args){
		
		Scanner stdIn=new Scanner(System.in);
		Random rand=new Random();
		
		
		
		String []month ={"January","Febuary","March","April","May","June","July","August","September","October","November","Dexember"};
		
		System.out.println("�p��̌�������͂��Ă��������B\n�Ȃ��A�擪�͑啶���ŁA2�����ڈȍ~�͏������Ƃ��܂��B");
		
		while(true){
			int number=rand.nextInt(12)+1;
			System.out.print(number+"���F");
			String m=stdIn.next();
			
			if(!(m.equals(month[number-1]))){
				System.out.println("�Ⴂ�܂��B");
			}else{
				System.out.println("�����ł��B������x�H�@1�cYes/0�cNo");
				int question=stdIn.nextInt();
				
				if (!(question==1)){
					break;
				}
			}
		}
	}
}