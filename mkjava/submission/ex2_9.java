//—”

import java.util.Random;

class ex2_9 {

	public static void main(String[] args) {
		Random rand = new Random();
		
		
		double x = rand.nextDouble();    //0ˆÈã1–¢–‚Ì—”
		double y = rand.nextDouble()*10;   //0ˆÈã10–¢–‚Ì—”	
		double z = rand.nextDouble()*2 - 1;    //-1.0`0–¢–‚Ì—”
		
		System.out.println("0.0ˆÈã1.0–¢–‚ÌÀ”’l : " + x);
		System.out.println("0.0ˆÈã10.0–¢–‚ÌÀ”’l : " + y);
		System.out.println("-1.0ˆÈã1.0–¢–‚ÌÀ”’l : " + z);
	}
}		
		