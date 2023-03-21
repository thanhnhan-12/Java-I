package Day7.Example.Bai2;

public class Employee {
  /* 1. Variables */
  private String name;
  private double salary;

  /* 2. Constructor */
  public Employee() {}

  public Employee(String name, double salary ) {
    this.name = name;
    this.salary = salary;
  }

  /* 3. Getter and Setter */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  
}
