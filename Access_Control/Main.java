package Access_Control;

public class Main {
    public static void main(String[] args) {
     A obj=new A(10,"Kunal");

     //NEED TO DO FEW THINGS
        //1.ACCESS THE DATA MEMBERS
        // 2.MODIFY THE DATA MEMBERS

/*

   ArrayList<Integer> list=new ArrayList<>();
   list.DEFAULT_CAPACITY;

   ----THIS DEFAULT CAPACITY IS A PRIVATE METHOD WHICH CANT BE USED
*/
        obj.setNum(4);
       System.out.println( obj.getNum());

       //TO ACCESS A PRIVATE KEY IN DIFFERENT PACKAGES WE NEED TO USE GETNUM AND SETNUM
       //PRIVATE KEY CAN ONLY BE ACCESSED WITHIN A CLASS AND WITHIN PACHAGES USING GETNUM AND SETNUM
        //
    }
}
