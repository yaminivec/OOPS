package Principles.polymorphism;

public class ObjectPrint {
    int num;

    public ObjectPrint(int num){
        this.num=num;

    }
    //THIS FUNCTION OVERRIDES THE ACTUAL INBUILD TOSTRING METHOD WHICH IS PRESENT IN JAVA.LANG
    @Override
    public String toString(){
        return "ObjectPrint{"+"nums="+ num +"}";
    }

    public static void main(String[] args) {
        ObjectPrint obj=new ObjectPrint(54);
        System.out.println(obj);
    }
}
