package Principles.polymorphism;

public class Square extends Shapes{
    @Override //THIS IS CALLED ANNOTATION
        //CONFIRMS THAT THE METHOD IS OVERRIDDEN OR NOT
    void area(){
        System.out.println("Area is square of sides");
    }
}
