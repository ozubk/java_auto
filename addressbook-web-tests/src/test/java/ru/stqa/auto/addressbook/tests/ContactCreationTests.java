package ru.stqa.auto.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.auto.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() {

    app.gotoHomePage();
    app.initContactCreation();
    app.fillContactCreation(new ContactData("Test name1", "Test last name1", "1-111-111", "1-111-111-11-11", "test1@test.com"));
    app.submitContactCreation();
    app.gotoHomePage();
  }

}
