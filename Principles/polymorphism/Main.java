package Principles.polymorphism;

import Principles.inheritance.BoxWeight;

public class Main {
    public static void main(String[] args) {
        Shapes shape=new Shapes();
        Circle circle=new Circle();
        Square square=new Square();

        shape.area();
        circle.area();
        square.area();

        Shapes s1=new Circle();


    }
}
