package Day9.Example.Example2;

public class User {
  // 1. Variables
  private String name;
  private String email;
  private String passWord;

  // 2. Constructor
  public User() {
  }

  public User(String name, String email, String passWord) {
    this.name = name;
    this.email = email;
    this.passWord = passWord;
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

  public String getPassWord() {
    return passWord;
  }

  public void setPassWord(String passWord) {
    this.passWord = passWord;
  }

  // 4. Methods
  @Override
  public String toString() {
    return "User: \n\t - " + name + "\n\t - " + email + "\n\t - " + passWord ;
  }



}
