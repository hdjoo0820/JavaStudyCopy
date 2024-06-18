package c_prac;

//객체지향 프로그래밍(OOP)을 연습할 수 있는 다양한 문제 예제들을 제공하겠습니다. 
//각 문제는 클래스, 객체, 상속, 다형성 등의 개념을 연습할 수 있게 구성되어 있습니다.
//
//예제 문제 1: 은행 계좌 관리 시스템
//설명: 은행 계좌를 모델링하는 클래스를 작성하세요. 
//계좌는 예금, 출금, 잔액 조회 기능을 가져야 합니다.
//
//요구사항:
//
//BankAccount 클래스:
//
//필드: accountNumber, balance
//메서드: deposit(amount), withdraw(amount), checkBalance()
//SavingsAccount 클래스 (BankAccount 상속):
//
//추가 필드: interestRate
//메서드: addInterest()
public class BankAccount {
	String accountNumber;
	int balance;
	
	public BankAccount(String accountNumber, int balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public int deposit(int amount) {
		return balance += amount;
	}
	
	public int withdraw(int amount) {
		return balance -= amount;
	}
	
	public int checkBalance() {
		return balance;
	}
	
	public static void main(String[] args) {
		BankAccount bk = new BankAccount("a123123", 1234567);
		SavingsAccount sv = new SavingsAccount(bk.accountNumber, bk.balance);
		bk.deposit(123);
		bk.withdraw(234324);
		sv.addInterestRate(bk.balance);
		
		System.out.println(sv.addInterestRate(bk.balance));
	}
}

