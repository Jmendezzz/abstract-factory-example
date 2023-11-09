package models;

public class Customer {
  private String name;
  private UserType userType;

  public Customer(String name, UserType userType) {
    this.name = name;
    this.userType = userType;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UserType getUserType() {
    return userType;
  }

  public void setUserType(UserType userType) {
    this.userType = userType;
  }
}
