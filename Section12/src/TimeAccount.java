class TimeAccount extends Account {
	private long timeBalance;				// �a���c���i����a���j

	// �R���X�g���N�^
	TimeAccount(String name, String no, long balance, long timeBalance) {
		super(name, no, balance);			// �N���XAccount�̃R���X�g���N�^�̌ďo��
		this.timeBalance = timeBalance;	// �a���c���i����a���j
	}
	
	//classmethod
	//���v�z���r���Aa�̂ق����傫�����1�A���������0�Ab�̂ق����傫�����-1��ԋp
	static int compBalance(Account a,Account b) {
			
		long aSum;
		long bSum;
			
		//create aSum
		if(a instanceof TimeAccount ) {
			aSum = a.getBalance() + ((TimeAccount)a).getTimeBalance();
		}else {
			aSum = a.getBalance();
		}
			
		//create bSum
		if(b instanceof TimeAccount ) {
			bSum = b.getBalance() + ((TimeAccount)b).getTimeBalance();
		}else {
			bSum = b.getBalance();
		}
			
		if(aSum>bSum) return 1;
		else if(aSum==bSum) return 0;
		else return -1;
	}
	
	// instancemethod
	// ����a���c���𒲂ׂ�
	long getTimeBalance() {
		return timeBalance;
	}

	// ����a������񂵂đS�z�𕁒ʗa���Ɉڂ�
	void cancel(long k) {
		deposit(timeBalance);
		timeBalance = 0;
	}
	
	
}
