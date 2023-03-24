package Day9.Example.Example2;

import java.util.function.*;

public class Member {
  // 1. Variables
  private String name;
  private String email;

  // 2. Constructor
  public Member() {}

  public Member(String name, String email) {
    super();
    this.name = name;
    this.email = email;
  }

  // 3. Getter and Setter
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  // 4. Methods
  @Override
  public String toString() {
    return "Member: \n\t - " + name + "\n\t - " + email;
  }

  public static void main(String[] args) {
    User user = new User("Pep Guardiola", "pep@gmail.com", "123");
    Function<User, Member> convertUserToMember = (u) -> new Member(u.getName(), u.getEmail() );
    Member member = convertUserToMember.apply(user);
    System.out.println(member);
    System.out.println(user);
  }

}
