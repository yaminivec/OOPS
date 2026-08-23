package Principles.polymorphism;

public class Circle extends Shapes{
    @Override //THIS IS CALLED ANNOTATION
        //CONFIRMS THAT THE METHOD IS OVERRIDDEN OR NOT
    void area(){
        System.out.println("Area is pie * r * r");
    }

}
