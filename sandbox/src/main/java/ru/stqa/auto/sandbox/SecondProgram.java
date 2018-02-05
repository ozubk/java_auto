package ru.stqa.auto.sandbox;

public class SecondProgram {

  public static void main(String[] args) {

    Point p1 = new Point(2.0, 1.0);
    Point p2 = new Point(-2.0, -3.0);
    Point p3 = new Point(4.0, 3.75);
    Point p4 = new Point (10.3, -5.53);


    System.out.println("Расстояние между точками (" + p1.x + ',' + p1.y + ") и (" + p2.x + ',' + p2.y + ") = " + p1.distance(p2));
    System.out.println("Расстояние между точками (" + p2.x + ',' + p2.y + ") и (" + p1.x + ',' + p1.y + ") = " + p2.distance(p1));
    System.out.println("Расстояние между точками (" + p3.x + ',' + p3.y + ") и (" + p4.x + ',' + p4.y + ") = " + p4.distance(p3));
    System.out.println("Расстояние между точками (" + p1.x + ',' + p1.y + ") и (" + p4.x + ',' + p4.y + ") = " + p4.distance(p1));
    System.out.println("Расстояние между точками (" + p2.x + ',' + p2.y + ") и (" + p3.x + ',' + p3.y + ") = " + p3.distance(p2));
  }

}
