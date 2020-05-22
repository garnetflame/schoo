import java.util.Random;
public class ex7_8 {

	public static void main(String[] args) {
		Random rand = new Random();
		int a =rand.nextInt();
		int b =rand.nextInt();

		System.out.println(a +"以上"+ b +"以下の乱数を生成します。bの値がaより小さい場合aの値を表示します");
		int n =rand.nextInt();
	
		int x =random(n,a,b);
		
		System.out.println(x);
		
	}
	
	public static int random(int n ,int a ,int b) {
		if(a > b) {
			return a;
		}else {
			return n;
		}

	}
}
