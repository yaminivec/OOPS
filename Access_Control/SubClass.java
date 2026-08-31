package Access_Control;

import Access_Control.A;
public class SubClass extends A{

    public SubClass(int num,String name){
        super(num,name);

    }

    public static void main(String[] args) {
     A   obj =new A(45,"Kunal");
  //  int n=obj.num;
    }
}

class SubClass2 extends A{

    public SubClass2(int num,String name){
        super(num,name);

    }

    public static void main(String[] args) {
        A   obj =new A(45,"Kunal");
        //  int n=obj.num;
    }
}


class subSubClass2 extends A{

    public subSubClass2(int num,String name){
        super(num,name);

    }

    public static void main(String[] args) {
        A   obj =new A(45,"Kunal");
        //  int n=obj.num;
    }
}
