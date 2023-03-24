package Day9.HomeWork;

public class TotalSalary {
  /* 1. Variables */
  private String name;
  private float salary;
  private float bonus;

  /* 2. Constructor */
  public TotalSalary() {}

  public TotalSalary(String name, float salary, float bonus) {
    this.name = name;
    this.salary = salary;
    this.bonus = bonus;
  }

  /* 3. Getter and Setter */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public float getSalary() {
    return salary;
  }

  public void setSalary(float salary) {
    this.salary = salary;
  }

  public float getBonus() {
    return bonus;
  }

  public void setBonus(float bonus) {
    this.bonus = bonus;
  }

  /* 4. Method */
  public float totalSalary() {
    return salary + bonus;
  }

  public static void main(String[] args) {
    TotalSalary staff = new TotalSalary("Jurgen Klopp", 25000, 310000);
    
    System.out.println("Name: " + staff.getName() + "\nSalary: " + staff.getSalary() + "\nBonus: " + staff.getBonus());
    System.out.println("Total Salary of Staff: " + staff.totalSalary());
  }

}
