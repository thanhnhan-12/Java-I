package Day7.Example.Bai2;

public class Manager extends Employee {
  /* 1. Variables */
  private double bonus;

  /* 2. Constructor */
  public Manager() {}

  public Manager(String name, double salary, double bonus) {
    super(name, salary);
    this.bonus = bonus;
  }

  // 3. Methods
  public double getSalary() {
    double baseSalary = super.getSalary();
    return baseSalary + bonus;
  }
}
