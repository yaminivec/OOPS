package class_object;
import java.util.*;

public class creaating_class {
    public static void main(String[] args) {
        Student[] students = new Student[5];

        System.out.println(Arrays.toString(students));//before creating objects returns null

        //TWO WAYS OF CREATING REFERENCE VARIABLE
        //1
        Student s1 = new Student();
        //2
        Student s2;
        s2 = new Student();

        System.out.println(s1);//returns random number
        System.out.println(s1.rno);//before creating objects return 0
        System.out.println(s1.name);//null

        s1.rno = 13;
        s1.name = "Rohith";
        s1.marks = 99.7f;


        System.out.println(s2);//RANDOM VALUE
        System.out.println(s2.rno);//13
        System.out.println(s2.name);//Kunal
        System.out.println(s2.marks);//99.5


        s1.changename("vamsi");
        s1.greeting();

        //OVERLOADING WITH ANOTHER OBJECT
        Student s3 = new Student(s2);

        //PRINTING THE OVERLOADED VALUE FROM ANOTHER OBJECT
        System.out.println(s3);//RANDOM VALUE NOT SAME AS S2
        System.out.println(s3.rno);//13
        System.out.println(s3.name);//Kunal
        System.out.println(s3.marks);//99.5

        Student random1 = new Student();
        System.out.println(random1.name);
    }

    //create a class
    //to create objects of class use new operator
    static class Student {
        int rno;
        String name;
        float marks;

        // CONSTRUCTOR
        void greeting() {
            System.out.println("HI! MY NAME IS " + this.name);
        }

        void changename(String newname) {
            name = newname;
        }

        Student() {
            this.rno = 13;
            this.name = "Kunal";
            this.marks = 99.5f;
        }

        //CONSTRUCTOR OVERLOADING WITH ARGUMENTS
        Student(int rno, String name, float marks) {
            this.rno = rno;
            this.name = name;
            this.marks = marks;
        }

        //TAKES VALUE FROM ANOTHER OBJECT
        Student(Student other) {
            this.rno = other.rno;
            this.name = other.name;
            this.marks = other.marks;

            //           CALLING FROM ANOTHER CONSTRUCTOR
            //            Student(){
            //                 this(13,"DEFAULT PERSON",100.0f);
            //               }
        }
    }
}