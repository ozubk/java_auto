package ru.stqa.auto.addressbook.model;

public class ContactData {

  private final String firstname;
  private final String lastname;
  private final String phoneHome;
  private final String phoneMobile;
  private final String email;
  private  String group;

  public ContactData (String firstname, String lastname, String phoneHome, String phoneMobile, String email, String group) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.phoneHome = phoneHome;
    this.phoneMobile = phoneMobile;
    this.email = email;
    this.group = group;
  }

  public String getFirstname() {
    return this.firstname;
  }

  public String getLastname() {
    return this.lastname;
  }

  public String getPhoneHome() {
    return this.phoneHome;
  }

  public String getPhoneMobile() {
    return this.phoneMobile;
  }

  public String getEmail() {
    return this.email;
  }

  public String getGroup() {
    return group;
  }
}
