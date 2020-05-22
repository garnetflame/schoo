
public class Ex10_2EXid {
	private static int counter = 0;
	private int id;
	private static int a = 1;

	//コンストラクタ
	public Ex10_2EXid() {
		 counter += a;
		 id = counter;
	}

	public static void increaseN(int n) {
		a = n;
	}

	public int getId() {
		return id;
	}
	public static int getMaxId() {
		return counter;
	}
}
