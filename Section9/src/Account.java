// ��s�����N���X�y��Q�Łz
class Account {
	private String name;			// �������`
	private String no;			// �����ԍ�
	private long balance;		// �a���c��
	private Day AccountOpeningDate; //�����J�ݓ�
	
	//--- �R���X�g���N�^ ---//
	Account(String n, String num, long z,Day AccountOpeningDate) {
		name = n;					// �������`
		no = num;					// �����ԍ�
		balance = z;				// �a���c��
		this.AccountOpeningDate=new Day(AccountOpeningDate);
	}

	//--- �������`�𒲂ׂ� ---//
	String getName() {
		return name;
	}

	//--- �����ԍ��𒲂ׂ� ---//
	String getNo() {
		return no;
	}

	//--- �a���c���𒲂ׂ� ---//
	long getBalance() {
		return balance;
	}
	
	//--- �����J�ݓ��𒲂ׂ� ---//
	Day getAccountOpeningDate() {
		return new Day(AccountOpeningDate);
	}

	//--- k�~�a���� ---//
	void deposit(long k) {
		balance += k;
	}

	//--- k�~���낷 ---//
	void withdraw(long k) {
		balance -= k;
	}
	
	@Override
	public String toString() {
		return "�����J�ݓ���"+AccountOpeningDate.toString()+"�ł��B";
	}
}
