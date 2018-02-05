package ru.stqa.auto.sandbox;

/**
 * Created by zubkov_oa on 04.02.2018.
 */

public class Rectangle {

  public double a;
  public double b;

  public Rectangle(double a, double b) {

    this.a = a;
    this.b = b;
  }

  public double area() {
    return this.a * this.b;
  }
}
