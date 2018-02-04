package ru.stqa.auto.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {

    double a = 4, b = 6, l = 5;

    hello("world");
    hello("user");
    hello("Alexei");

    System.out.println("Площадь квадрата со стороной " + l + " = " + area(l));

    System.out.println("Площадь прямоугольника со сторонами " + a + " = " + b + " = " + area(a, b));
  }

  public static void hello(String somebode) {
    System.out.println("Hello, " + somebode + '!');
  }

  public static double area(double len) {
    return len * len;
  }

  public static double area(double a, double b) {
    return a * b;
  }

}