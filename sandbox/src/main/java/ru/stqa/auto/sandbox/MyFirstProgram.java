package ru.stqa.auto.sandbox;


public class MyFirstProgram {

  public static void main(String[] args) {

    Square s = new Square(5);
    Rectangle r = new Rectangle(4,6);

    hello("world");
    hello("user");
    hello("Alexei");

    System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

    System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());
  }

  public static void hello(String somebode) {
    System.out.println("Hello, " + somebode + '!');
  }

}