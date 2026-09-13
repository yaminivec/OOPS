package enumExamples;

import com.sun.jdi.PathSearchingVirtualMachine;

public class Basic {
    enum Week implements A{
        Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;

        //THESE ARE ENUM CONSTANTS
        //PUBLIC ,STATIC AND FINAL
        //SINCE IT IS FINAL WE CANT CREATE CHILD ENUM
        //TYPE IS WEEK
        Week(){
            System.out.println("Constructor called for "+this);
        }

        //THIS IS NOT PUBLIC OR PROTECTED ,ONLY PRIVATE OR DEFAULT
        // WE DONT WANT TO CREATE OR MODIFY ENUM

        @Override
        public void hello(){
            System.out.println("How are you?");
        }
    }

    public static void main(String[] args) {
        Week week;
        week =Week.Monday;

   //    for(Week day: Week.values()){
    //        System.out.println(day);
   //     }

     //   System.out.println(week);

   //     System.out.println(week.ordinal());
        week.hello();
        System.out.println(week.valueOf("Monday"));
        //RETURN THE ENUM CONSTANT
    }

}
