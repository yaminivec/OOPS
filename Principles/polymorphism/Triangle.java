package Principles.polymorphism;

public class Triangle extends Shapes{
    @Override //THIS IS CALLED ANNOTATION
    //CONFIRMS THAT THE METHOD IS OVERRIDDEN OR NOT
    void area(){
        System.out.println("Area is 0.5 * h * b");
    }
}
