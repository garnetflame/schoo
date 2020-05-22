import java.util.Random;
import java.util.Scanner;

class ex6_15 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		String[] dayString = { "sunday" ,"monday" ,"tuesday" ,"wednesday","thursday","friday","saturday"};
		String[] aString = { "日" ,"月" ,"火" ,"水","木","金","土"};
		
		int retry = 1;
		String x;
		int day;
		int t = 20;
		int y = 0;
		int flag = 0;
		
	

		do{
			if(flag == 0){
				do{
					y = rand.nextInt(7); //出題される月の数字：0～11の乱数
				}while(t == y);
			}
			System.out.print(aString[y] + "曜日 : ");
			x = stdIn.next();
		
			if(dayString[y].equals(x)){
				System.out.print("正解です。");
				System.out.print("もう一度？ 1…Yes / 0…NO :");
				retry = stdIn.nextInt();
				if(retry == 1){
				t = y;
				flag = 0;
				continue;
			}else if(retry == 0)break;
			}else{
				System.out.println("違います。");
				flag = 1;
			}
		}while(retry == 1);
		
		System.out.println("お疲れ様でした");
	}	
}		