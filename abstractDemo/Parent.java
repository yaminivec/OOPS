package abstractDemo;

public abstract class Parent {
    int age;
    final int VALUE;
    public Parent(int age){
        this.age=age;
        VALUE=234453222;
    }
    //CONSTRCUTOR DOESNT HAVE ABSTRACT CONSTRUCTORS
   // abstract Parent();

    static void hello(){
        System.out.println("Hey");
    }

    void normal(){
        System.out.println("Non static methods are accepted in abstract classes and can be overriden");
    }

 abstract void career();
 abstract void partner();
}
