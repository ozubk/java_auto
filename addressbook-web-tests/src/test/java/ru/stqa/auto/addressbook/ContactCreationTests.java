package ru.stqa.auto.addressbook;

import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() {

    gotoHomePage();
    initContactCreation();
    fillContactCreation(new ContactData("Test name1", "Test last name1", "1-111-111", "1-111-111-11-11", "test1@test.com"));
    submitContactCreation();
    gotoHomePage();
  }

}
