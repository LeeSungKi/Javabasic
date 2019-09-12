package basic;

class Account {
	private int money;

	public synchronized void addMoney() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		money += 2000;
		System.out.println("2000원 입금 완료! 잔액 : " + money);

		notify();
	}

	public synchronized void getMoney() {
		while (money <= 0) {
			System.out.println("잔고 채워지길 기다리는 중...");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		money -= 2000;
		System.out.println("2000원 출금 완료! 잔액 : " + money);
	}
}

class Taker extends Thread {
	private Account account;

	Taker(Account account) {
		this.account = account;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			account.getMoney();
		}
	}
}

class Giver extends Thread {
	private Account account;

	Giver(Account account) {
		this.account = account;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			account.addMoney();
		}
	}

}
public class Test05 {
	public static void main(String[] args) {
		Account account = new Account();
		Giver mom = new Giver(account);
		Taker son = new Taker(account);
		son.start();
		mom.start();
	}
}
