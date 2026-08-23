package Principles.inheritance;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight(){
        this.weight=-1;

    }
    BoxWeight (BoxWeight other){
        super(other);
        weight=other.weight;
    }

    static void Greeting(){ // CAN WE OVERRIDE STATIC METHODS ?YES YOU CAN INHERIT BUT U CANT OVERRIDE
        System.out.println("HI,I AM IN BOX CLASS.GREETINGS!");
    }

    public BoxWeight(double l,double h,double w,double weight){

        super(l,h,w);  //CALLS THE PARENT CLASS CONSTRUCTOR
        //USED TO INITIALIZE VALUES PRESENT IN PARENT CLASS
        System.out.println(this.weight);
        System.out.println(super.weight);

        //HERE THE WORK OF THIS AND SUPER ARE SAME WHEN THE SUPER /PARENT CLASS DOESNT HAVE
        //SIMILAR VARIABLE NAMED WEIGHT
        //WHEN THE VARIABLE WEIGHT IS THERE IN SUPER/PARENT CLASS THEN USE SUPER KEYWORD TO RETRIEVE
        //WHEN THE VARIABLE WEIGHT IS MENTIONED WITHIN THE CHILD CLASS USE THIS KEYWORD TO REFER THE OBJECT

        this.weight=weight;
    }

    public BoxWeight(double side,double weight){
        super(side);
        this.weight=weight;

    }
}

