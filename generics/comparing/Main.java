package generics.comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
     Student kunal = new Student(12,88.76f);
     Student rahul= new Student(5,99.45f);
     Student arpit=new Student(1,88.95f);
     Student karan=new Student(16,94.67f);
     Student sachin=new Student(8,65.35f);

     Student[] list={kunal,rahul,arpit,karan,sachin};


/*
     Arrays.sort(list, new Comparator<Student>() {
         @Override
         public int compare(Student o1, Student o2) {
             return (int)(o1.marks-o2.marks);
         }
     });

*/
        Arrays.sort(list,(o1,o2)->-(int)(o1.marks-o2.marks));
        System.out.println(Arrays.toString(list));

     if(kunal.compareTo(rahul)<0){
         System.out.println(kunal.compareTo(rahul));
         System.out.println("Rahul has more marks");
     }
    }
}
