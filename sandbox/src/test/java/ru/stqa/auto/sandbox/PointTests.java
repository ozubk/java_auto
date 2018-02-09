package ru.stqa.auto.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by zubkov_oa on 09.02.2018.
 */

public class PointTests {

  private Point p1 = new Point(2.0,1.0);
  private Point p2 = new Point(-2.0,-3.0);
  private Point p3 = new Point(4.0,3.75);
  private Point p4 = new Point(10.3,-5.53);

  @Test
  public void testDistanceP1P2() {

    Assert.assertEquals(p1.distance(p2), 5.656854249492381);
  }

  @Test
  public void testDistanceP3P4() {

    Assert.assertEquals(p3.distance(p4), 11.2164343710468);
  }

  @Test
  public void testDistP1P4() {

    Assert.assertEquals(p1.distance(p4), 10.560819097020838);
  }

  @Test
  public void testDistanceP2P3() {
    Assert.assertEquals(p2.distance(p3), 9.031195934094221);
  }
}
