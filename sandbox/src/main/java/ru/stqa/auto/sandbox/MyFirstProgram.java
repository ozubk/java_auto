package ru.stqa.auto.sandbox;


public class MyFirstProgram {

  public static void main(String[] args) {

    Square s = new Square(5);
    Rectangle r = new Rectangle(4,6);

    Point p1 = new Point(2.0, 1.0);
    Point p2 = new Point(-2.0, -3.0);
    Point p3 = new Point(4.0, 3.75);
    Point p4 = new Point (10.3, -5.53);

    hello("world");
    hello("user");
    hello("Alexei");

    System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

    System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());

    System.out.println("Расстояние между точками (" + p1.x + ',' + p1.y + ") и (" + p2.x + ',' + p2.y + ") = " + p1.distance(p2));
    System.out.println("Расстояние между точками (" + p2.x + ',' + p2.y + ") и (" + p1.x + ',' + p1.y + ") = " + p2.distance(p1));
    System.out.println("Расстояние между точками (" + p3.x + ',' + p3.y + ") и (" + p4.x + ',' + p4.y + ") = " + p4.distance(p3));
    System.out.println("Расстояние между точками (" + p1.x + ',' + p1.y + ") и (" + p4.x + ',' + p4.y + ") = " + p4.distance(p1));
    System.out.println("Расстояние между точками (" + p2.x + ',' + p2.y + ") и (" + p3.x + ',' + p3.y + ") = " + p3.distance(p2));
  }

  public static void hello(String somebode) {
    System.out.println("Hello, " + somebode + '!');
  }

}