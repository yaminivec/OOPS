package packages.staticExamples;

//WE CANT CREATE OUTSIDE CLASSES

//TEST CLASS THAT DOESN'T DEPEND ON INNERCLASS

/* class Test{
    static String name;
    public Test(String name){
        Test.name=name;
    }
} */   //OUTPUT
       //RAHUL
      //RAHUL

public class InnerClasses {
    //CLASS ITSELF TEST ITSELF DEPENDS ON INNERCLASSES


    static  class Test{
      String name;

      public Test(String name){
          this.name=name;
      }
    }
    //OUTPUT
    //KUNAL
    //RAHUL


    public static void main(String[] args) {
       // CANT USE THE INNER CLASS TEST WITHOUT STATIC VARIABLE
        // CLASS
     Test a= new Test ("Kunal");
     Test b= new Test ("Rahul");
     System.out.println(a.name);
     System.out.println(b.name);
    }
}
