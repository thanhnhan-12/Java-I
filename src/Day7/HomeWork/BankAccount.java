package Day7.HomeWork;

public class BankAccount {
  // 1. Variables
  private double balance;
  private int id;

  // 2. Constructor
  public BankAccount() {}

  public BankAccount(double balance, int id) {
    this.balance = balance;
    this.id = id;
  }

  // 3. Getter and Setter
  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
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
