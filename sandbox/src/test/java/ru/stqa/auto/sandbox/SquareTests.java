package ru.stqa.auto.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.auto.sandbox.Square;


/**
 * Created by zubkov_oa on 06.02.2018.
 */

public class SquareTests {

  @Test
  public void testArea() {
    Square s = new Square(5);
    Assert.assertEquals(s.area(),25.0);
  }
}
