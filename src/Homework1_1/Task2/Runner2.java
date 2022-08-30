package Homework1_1.Task2;

import java.util.Arrays;

public class Runner2 {
    public static void main(String[] args) {
        MyList<Object> myList = new MyList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        System.out.println(Arrays.toString(myList.getObjects()));

        myList.add(4);
        myList.add(5);
        System.out.println(Arrays.toString(myList.getObjects()));
    }
}
