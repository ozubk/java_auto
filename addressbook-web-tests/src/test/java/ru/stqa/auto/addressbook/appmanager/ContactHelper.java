package ru.stqa.auto.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.auto.addressbook.model.ContactData;

public class ContactHelper extends HelperBase {

  public ContactHelper(FirefoxDriver wd) {
    super(wd);
  }

  public void initContactCreation() {
    wd.findElement(By.linkText("add new")).click();
  }

  public void fillContactCreation(ContactData contactData) {
    type(By.name("firstname"), contactData.getFirstname());
    type(By.name("lastname"), contactData.getLastname());
    type(By.name("home"), contactData.getPhoneHome());
    type(By.name("mobile"), contactData.getPhoneMobile());
    type(By.name("email"), contactData.getEmail());
   }

  public void submitContactCreation() {
    click(By.name("submit"));
  }
}
