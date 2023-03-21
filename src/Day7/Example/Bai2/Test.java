package Day7.Example.Bai2;

public class Test {
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
