
public class Ex10_1id {
	private static int counter = 0;
	private int id;
	
	//コンストラクタ
	public Ex10_1id() {
		id = ++counter;
	}

	public int getId() {
		return id;
	}
	public static int getMaxId() {
		return counter;
	}
}
