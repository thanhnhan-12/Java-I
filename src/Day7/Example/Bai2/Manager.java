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

  public static void main(String[] args) {
    Manager m = new Manager("Pep", 780, 55);
    Employee[] staff = new Employee[3];

    staff[0] = m;

    staff[1] = new Employee("Klopp", 800);
    staff[2] = new Employee("Arteta", 0);

    for(Employee e : staff) {
      System.out.println(e.getName() + ", salary: " + e.getSalary() );
    }

  }
}
