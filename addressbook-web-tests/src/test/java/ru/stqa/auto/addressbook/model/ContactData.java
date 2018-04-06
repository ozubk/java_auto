package ru.stqa.auto.addressbook.model;

public class ContactData {

  private String firstname;
  private String lastname;
  private String phoneHome;
  private String phoneMobile;
  private String email;

  public ContactData (String firstname, String lastname, String phoneHome, String phoneMobile, String email) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.phoneHome = phoneHome;
    this.phoneMobile = phoneMobile;
    this.email = email;
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

}
