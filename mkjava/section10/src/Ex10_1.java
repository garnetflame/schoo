
public class Ex10_1 {

	public static void main(String[] args) {
		Ex10_1id a = new Ex10_1id();
		Ex10_1id b = new Ex10_1id();
		Ex10_1id c = new Ex10_1id();
		
		System.out.println("aの識別番号 : "+ a.getId());
		System.out.println("bの識別番号 : "+ b.getId());
		System.out.println("cの識別番号 : "+ c.getId());
		//System.out.println("Ex10_1id.counter = "+ Ex10_1id.counter);
		//System.out.println("a.counter = "+ a.counter);
		//System.out.println("b.counter = "+ b.counter);
		System.out.println("最後の識別番号 : "+ Ex10_1id.getMaxId());
	}

}
