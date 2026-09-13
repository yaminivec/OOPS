package cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Human kunal=new Human(34,"Kunal");

        // TIME CONSUMING BECAUSE WE CREATE ANOTHER OBJECT USING NEW KEYWORD
        //    Human twin=new Human(kunal);

        Human twin=(Human) kunal.clone();
        System.out.println(twin.age+" "+twin.name);
        System.out.println(Arrays.toString(twin.arr));

        twin.arr[0]=200;
        System.out.println(Arrays.toString(kunal.arr));
        System.out.println(Arrays.toString(twin.arr));

        System.out.println("AFTER SHALLOW AND DEEP CLONING TWIN ARR WILL BE CHANGED BUT ORIGINAL WILL REMAIN THE SAME");
        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString(kunal.arr));




    }
}
