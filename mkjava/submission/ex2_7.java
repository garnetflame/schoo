//—”

import java.util.Random;

class ex2_7 {

	public static void main(String[] args) {
		Random rand = new Random();
		
		
		int x = rand.nextInt(9) +1 ;
		int y = rand.nextInt(9) -9 ;    //-9ˆÈã0–¢–‚Ì—”
		int z = rand.nextInt(90) + 10;	//10ˆÈã100–¢–‚Ì—”	
		
		System.out.println("ˆêŒ…‚Ì³‚Ì®”’l : " + x);
		System.out.println("ˆêŒ…‚Ì•‰‚Ì®”’l : " + y);
		System.out.println("“ñŒ…‚Ì³‚Ì®”’l : " + z);
	}
}		
		