package sec01.exam01;
import java.util.Scanner;

class BankAccount{
	private String name = "홍길동";
	private String account = "H1234";
	private int balance =0;
	
	
	public BankAccount(String name, String account, int balance) {
		super();
		this.name = name;
		this.account = account;
		this.balance = balance;
	}

//	void BankAccount() {   이건 메소드 생성자가 아니다.
//		
//	}
	
	BankAccount() {		//생성자임
		name = "홍길동";
		account = "H1234";
		balance =0;
	}
	
	void deposit(int balance) {		//입금 가능
		this.balance+=balance;
	}
	
	void withdraw(int balance) {	//출금 가능
		this.balance-=balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
}

public class ScannerTest {

	public static void main(String[] args) {
//		String name = "홍길동";
//		String account = "H1234";
//		int balance =0;
		boolean bank=true;
		boolean run =true;
		boolean login =true;
		int i = 0;
		int num=0;
		
		Scanner sc = new Scanner(System.in);
	
		BankAccount ba = new BankAccount();
		
		while(run) {
			System.out.println("-------------------");
			System.out.println("1.로그인		| 2.회원가입		|3.종료");
			System.out.println("-------------------");
			System.out.println("선택>");
			
			int select=Integer.parseInt(sc.nextLine());
			if(login) {
				switch(select) {
				case 1:
					System.out.println("로그인>");
					System.out.println("-------------------");
					System.out.println("이름>");
					String rname= sc.nextLine();
					System.out.println("계정>");
					String raccount= sc.nextLine();
					
					if (rname.equals(ba.getName()) && raccount.equals(ba.getAccount())) {
						System.out.println("로그인 성공");
						login=true;
						run=false;
						select=3;
					}else {
						System.out.println("로그인 실패");
						System.out.printf("%d,번째 실패\n",i+1);
						++i;
						if(i>3) {
							System.out.println("3번째 실패입니다.\n강제종료");
							run=false;
							bank=false;
						}
					}
					break;
				case 2:
					System.out.println("회원가입>");
					System.out.println("-------------------");
					System.out.println("새 이름>");
					String name1= sc.nextLine();
					ba.setName()=name1;
					System.out.println("새 계정>");
					String account1= sc.nextLine();
					ba.account=account1;
					break;
				default :
					run =false;
				}
			}
		}
		while(bank) {
			if(login) {
				System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
				System.out.println("-------------------");
				System.out.println("선택>");
				
				int select=Integer.parseInt(sc.nextLine());
				
				switch(select) {
				case 1:
					System.out.println("예금액>");
					num=Integer.parseInt(sc.nextLine());
					ba.balance+=num;
					break;
				case 2:
					System.out.println("출금액>");
					num=Integer.parseInt(sc.nextLine());
					ba.balance-=num;
					
					break;
				case 3:
					System.out.println("잔고>");
					System.out.println(ba.balance);
					break;
				case 4:
					bank = false;
					break;
				}
			}
		}
		System.out.println("프로그램 종료");
		
			

	}
}



