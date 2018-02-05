package ru.stqa.auto.sandbox;

public class SecondProgram {

  public static void main(String[] args) {

    Point p1 = new Point(2.0, 1.0);
    Point p2 = new Point(-2.0, -3.0);

    System.out.println("Расстояние между точками (" + p1.x + ',' + p1.y + ") и (" + p2.x + ',' + p2.y + ") = " + distance(p1, p2));
  }

  public static double distance(Point p1, Point p2) {

    return Math.sqrt(power(p2.x - p1.x) + power(p2.y - p1.y) );
  }


  public static double power(double x) {
    return x * x;
  }
}
