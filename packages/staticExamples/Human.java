package packages.staticExamples;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    // COMMON PROPERTY
    static long population;

    static void message(){
        System.out.println("Hello");
        //  System.out.println(this.age);
        // CANNOT USE THIS INSIDE STATIC BECAUSE STATIC DOESN'T DEPEND ON ANY OBJECT
        // this.age refers to a object
    }


    public Human(int age,String name,int salary,boolean married){
        this.age=age;
        this.name=name;
        this.salary=salary;
        this.married=married;
        Human.population+=1;
        // TO ADDRESS ALL THE OBJECT PROPULATION ADDRESS WITH
        // CLASS NAME AND THIS BOTH
    }

}
