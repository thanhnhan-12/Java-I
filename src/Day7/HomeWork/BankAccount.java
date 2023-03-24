package Day7.HomeWork;

public class BankAccount {
  // 1. Variables
  static int count = 0;
  private double balance;
  private int id;

  // 2. Constructor
  public BankAccount() {}

  public BankAccount(double balance) {
    this.balance = balance;
    this.id = ++count;
  }

  // 3. Getter and Setter
  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  // 4. Methods
  // 4.1 Deposit
  public double deposit(int savingMoney) {
    return balance + savingMoney;
  }

  // 4.2 WithDraw
  public double withDraw(int savingMoney) {
    return balance;
  }

  public static void main(String[] args) {
    
  }
}
