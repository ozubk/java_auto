package ru.stqa.auto.sandbox;

/**
 * Created by zubkov_oa on 04.02.2018.
 */

public class Square {

  public double l;

  public Square(double l) {
    this.l = l;
  }

  public double area() {
    return this.l * this.l;
  }
}
