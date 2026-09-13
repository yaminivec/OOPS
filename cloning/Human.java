package cloning;

public class Human implements Cloneable{
    int age;
    String name;
    int[] arr;

    public Human(int age,String name){
        this.age=age;
        this.name=name;
        this.arr=new int[]{3,45,5,4,3,5};
    }
    /*   SINCE WE USED CLONEABLE THIS IS NOT NECESSARY
    public Human(Human other){
        this.age=other.age;
        this.name=other.name;
    }

 */

    /*
    public Object clone() throws CloneNotSupportedException{

        return super.clone();
    }*/

    public Object clone() throws CloneNotSupportedException{

        Human twin=(Human) super.clone();  //SHALLOW COPY

        //DEEP COPY
        twin.arr=new int[twin.arr.length];
        for (int i=0;i<twin.arr.length;i++){
            twin.arr[i]=this.arr[i];
        }
        return twin;

    }


}
