package collections;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        List<Integer> list2=new LinkedList<>();
        list.add(50);
        list2.add(51);
        list.add(52);
        list2.add(53);

        System.out.println(list2);
        List<Integer> vector= new Vector<>();
        vector.add(34);
        vector.add(35);
        vector.add(36);
        vector.add(37);
        System.out.println(vector);

    }
}
