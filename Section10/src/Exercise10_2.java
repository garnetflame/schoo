class ExId{
	static int counter=0;
	private int id;
	static int n=1;
	
	
	//class method
	static int getMaxId() {
		return counter;
	}
	
	static int setN(int N) {
		n=N;
		return n;
	}
	
	
	//�R���X�g���N�^
	public ExId() {
		counter+=n;
		id += counter;
	}
	
	//instance method
	public int getId() {
		return id;
	}
}

//main
public class Exercise10_2 {

	public static void main(String[] args) {
		ExId a = new ExId();
		ExId b = new ExId();
		ExId.setN(3);
		ExId c = new ExId();
		ExId d = new ExId();
		ExId e = new ExId();
		
		System.out.println("�Ō�ɗ^�������ʔԍ��F"+ ExId.getMaxId());
		
		System.out.println("a�̎��ʔԍ��F"+ a.getId());
		System.out.println("b�̎��ʔԍ��F"+ b.getId());
		System.out.println("c�̎��ʔԍ��F"+ c.getId());
		System.out.println("d�̎��ʔԍ��F"+ d.getId());
		System.out.println("e�̎��ʔԍ��F"+ e.getId());
		
		
		System.out.println("Id.counter = "+ ExId.counter);
		System.out.println("a.counter = "+ a.counter);
		System.out.println("b.counter = "+ b.counter);
		
		
	}

}
