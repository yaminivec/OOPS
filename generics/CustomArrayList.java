package generics;
import java.lang.reflect.Array;
import java.util.*;

public class CustomArrayList {

    private int[] data;
    private static int DEFAULT_SIZE=10;
    private int size=0;

    public CustomArrayList(){
        this.data=new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }
    private boolean isFull(){
        return size==data.length;
    }

    private void resize(){
        int[] temp=new int[data.length*2];

        for (int i=0;i<data.length;i++){
            temp[i]=data[i];
        }
        data=temp;

    }

    public int remove(){
        int removed=data[--size];
        return removed;
    }

    public int get(int index){
        return data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index,int value){
        data[index]=value;

    }

    @Override
    public String toString(){
        return "CustomArrayList{"+
                "data" +Arrays.toString(data)+
                ",size=" +size+'}';
    }

    public static void main(String[] args) {
     //   ArrayList list=new ArrayList();
        /* list.add(45);
        list.remove(0);
        list.get(0);
        list.set(1,6789);
        list.size();
        list.isEmpty();*/

        CustomArrayList list=new CustomArrayList();
   /*     list.add(3);
        list.add(9);
        list.add(12);
        System.out.println(list);

        Output: CustomArrayList{data[3, 9, 12, 0, 0, 0, 0, 0, 0, 0],size=3}

*/
      for(int i=0;i<14;i++){
            list.add(2*i);
        }
        System.out.println(list);
/*
OUTPUT
CustomArrayList{data[0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 0, 0, 0, 0, 0, 0],size=14}

 */

    }
}
