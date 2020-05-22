public class WelcomeJava {
	public static void main(String[] args) {
	
		final String[] COLOR = {"白", "黒", "ブルー", "緑", "黄", "ホワイト", "赤", "純 白", "紫"}; 
		char myName[] = {'浅', '野', '登','伍',};
		int myNameCode = 0;
		
		System.out.print("私の名前は");
		for (int i = 0; i < myName.length; i++) {
			System.out.print(myName[i]);
			myNameCode += myName[i];
		}
		System.out.println("です。");
		System.out.println("私のネームコードは" + myNameCode + "です。");
		System.out.println("ラッキーカラーは" + COLOR[myNameCode % 9] + "です。");
	}
}