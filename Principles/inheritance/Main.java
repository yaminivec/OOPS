package Principles.inheritance;

public class Main {
    public static void main(String[] args) {
       Box box1=new Box(4.6,7.9,9.9);
       Box box2=new Box(box1);

        //IT CONTAINS A CONSTRUCTOR NAMED old box WHICH TAKES THE VALUES OF PREVIOUSLY DEFINED BOX1

       System.out.println(box1.l+" "+box1.h+" "+box1.w); //4.6 7.9 9.9
       System.out.println(box2.l+" "+box2.h+" "+box2.w);//4.6 7.9 9.9


        BoxWeight box3=new BoxWeight();
        BoxWeight box4=new BoxWeight(2,3,4,5);

        System.out.println(box3.h+" "+box3.weight);
        System.out.println(box4.h+" "+box4.weight);

        Box box5=new BoxWeight(2,3,4,6);
        System.out.println(box5.l);

        //System.out.println(box5.weight);

        //THERE ARE MANY VARIABLES IN BOTH CHILD AND PARENT CLASSES
        //YOU ARE GIVEN ACCESS TO VARIABLES THAT ARE IN REFERENCE i.e.BoxWeight
        //HENCE YOU SHOULD HAVE ACCESS TO WEIGHT VARIABLE
        //THIS ALSO MEANS ONCE YOU ARE TRYING TO ACCESS SHOULD BE INITIALIZEZ
        //BUT HERE,WHEN THE OBJ ITSELF IS OF TYPE PARENT CLASS ,HOW YOU WILL CALL ITS FOLLOWING CHILD CLASS
        //THIS IS WHY ERROR OCCURS

        //BoxWeight box6=new Box(2,3,4);
        //System.out.println(box6); //ERROR

    BoxPrice box8=new BoxPrice(2,3,60);

        BoxWeight box9=new BoxWeight();
        BoxWeight.Greeting();

    }

}
