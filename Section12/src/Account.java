public class Account {

	private static int counter = 0;		// ���Ԃ܂ł̎��ʔԍ���^������

	private String name;			// �������`
	private String no;			// �����ԍ�
	private long balance;		// �a���c��
	private int id;				// ���ʔԍ�

	//-- �R���X�g���N�^ --//
	public Account(String n, String num, long z) {
		name = n;					// �������`
		no = num;					// �����ԍ�
		balance = z;				// �a���c��
		id = ++counter;			// ���ʔԍ�
	}

	//--- �������`�𒲂ׂ� ---//
	public String getName() {
		return name;
	}

	//--- �����ԍ��𒲂ׂ� ---//
	public String getNo() {
		return no;
	}

	//--- �a���c���𒲂ׂ� ---//
	public long getBalance() {
		return balance;
	}

	//--- ���ʔԍ����擾 ---//
	public int getId() {
		return id;
	}

	//--- k�~�a���� ---//
	public void deposit(long k) {
		balance += k;
	}

	//--- k�~���낷 ---//
	public void withdraw(long k) {
		balance -= k;
	}
}

