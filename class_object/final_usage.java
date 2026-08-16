package class_object;

public class final_usage {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        swap(a, b);
        System.out.println(a + " " + b);
        //DOESN'T SWAP BECAUSE JAVA PASSES PRIMITIVES BY PASS BY VALUE AND NOT BY REFERENCE

        Integer num1 = 25;
        Integer num2 = 50;

        swap(num1, num2);
        System.out.println(num1 + " " + num2);

        //OBJECT OVERWRITING IS ACCEPTED IN OBJECTS WITHOUT FINAL KEYWORD
        A obj1 = new A("SAM");
        obj1.name = "OTHER NAME";

        final A obj2 = new A("PRIYA");
        obj2.name = "VAISHU";
        // NON PRIMITIVES CAN CHANGE THE VALUES BUT CANT REASSIGN IT
        //--------- obj2=new A("ANU");

        A obj;
        for(int i=0;i<1000000000;i++){
            obj=new A("RANDOM NAME");
        }

    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    static class A {
        final int num = 10;
        String name;

        public A(String name) {
            System.out.println("OBJECT CREATED");
            this.name = name;
        }
        @Override
        protected void finalize() throws Throwable{
            System.out.println("OBJECT DESTROYED");
        }
    }

}
