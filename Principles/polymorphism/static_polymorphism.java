package Principles.polymorphism;

public class static_polymorphism {
    double sum(double a,double b){
        return a+b;
    }

    int sum(int a,int b,int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        static_polymorphism obj=new static_polymorphism();

        System.out.println(obj.sum(2,3)); // PASSES TO THE DOUBLE METHOD BY CASTING
        System.out.println(obj.sum(1,3,6));

        //obj.sum(1,4,5,6);
        //MISMATCH OF FUNCTION CALL
    }
}
