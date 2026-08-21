package packages.staticExamples;

    //THIS IS DEMO TO SHOW INITIALIZATION OF STATIC VARIABLES
    // THE CODE STARTS BY EXECUTING THE STATIC VARIABLES AND METHODS FIRST
    public class staticBlock {
        static int a=4;
        static int b;

        static{
            System.out.println("I AM IN STATIC BLOCK");
            b = a*5;
        }

        public static void main(String[] args) {
            staticBlock obj=new staticBlock();
            System.out.println(staticBlock.a+" "+staticBlock.b);

            staticBlock.b+=3;
            System.out.println(staticBlock.a+" "+staticBlock.b);

            staticBlock obj2=new staticBlock();
            System.out.println(staticBlock.a+" "+staticBlock.b);
        }
    }


