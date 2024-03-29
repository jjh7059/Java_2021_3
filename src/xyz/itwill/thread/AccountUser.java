package xyz.itwill.thread;

//은행계좌 사용자 정보(은행계좌정보, 사용자명)를저장하기 위한 클래스
public class AccountUser extends Thread {
	private Account account;//은행계정정보 - 포함
	private String userName;//사용자명
	
	public AccountUser() {
		// TODO Auto-generated constructor stub
	}

	public AccountUser(Account account, String userName) {
		super();
		this.account = account;
		this.userName = userName;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	 
	@Override
	public void run() {
		//다수의 스레드가 동시에 run() 메소드의 명령을 동시에 실행할 경우 동일 인스턴스의 메소드를
		//호출하여 필드값을 변경하여 처리할 경우 잘못된 결과 발생
		// => 스레드 동기화를 이용하여 스레드의 동일 인스턴스의 메소드 실행 순서를 자동 설정
		//스레드 동기화(Thread Synchronized) : 스레드의 메소드 요청에 대한 처리가 종료될 때까지
		//다른 스레드의 메소드 호출을 방지(Lock)하도록 스레드를 일시 중지하는 기능
		
		// => 메소드를 동기화 처리하는 방법 - 동기화 메소드(Synchronized Method)로 선언하여 호출
		// 권장함
		//account.deposit(userName, 5000);
		
		//메소드를 동기화 처리하는 방법 - 동기화 영역(Synchronized Block)에서 메소드 호출
		// => 인스턴스를 전달받아 인스턴스의 모든 메소드를 동기화 처리하여 호출
		// 권장하지않음 - setter와 getter까지 등 다른 메소드까지 동기화 되어버림. 성능에 영향을 미침
		synchronized (account) {
			account.withDraw(userName, 2000);	
		}
	}
}
