package packages.A;

public class static_example {
    public static void main(String[] args) {
//        greeting(); //STATIC METHOD WILL NOT CALL ANY NON STATIC METHOD
          Greeting();


    }
     //  void greeting(){
    //    System.out.println("Hello");
   //}

    static void Greeting(){
        System.out.println("Hello");
        static_example obj=new static_example();
        obj.fun();


      //   fun(); //CANNOT CALL A NON STATIC METHOD IN STATIC
    }
    void fun(){
        System.out.println("World");

        // Greeting(); // THIS WILL NOT GET EXECUTED SINCE WE DONT CALL fun()
        //TO ACCESS THIS WE ARE CREATING A OBJECT
        //BUT static METHOD CAN BE CALLED WITHIN non-static METHOD
    }
}
