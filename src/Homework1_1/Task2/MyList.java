package Homework1_1.Task2;

import java.util.ArrayList;

public class MyList <T>{
    //Задача №2
    //Создать класс MyList с атрибутами T[] objects, int size. T - generics.
    //Массив T[] будет создаваться при создании экземпляра класса MyList с размерностью 3.
    //Создать метод add. Он будет добавлять элемент в массив object. Если в массиве уже 3 элемента есть, то нужно:
    //    T[] objects;
    //
    //    T <> generics;
    //1.Создать новый массив T[] с размерностью в два раза больше предыдущей.

    private int size;
    private Object[] objects;
    private Integer[] integers = new Integer[size];

    public MyList(int size, Object[] objects) {
        this.size = size;
        this.objects = (T[]) new Object[3];
    }

    public boolean MultiplierArray(Integer size) {

        Integer[] newArray = new Integer[integers.length * 2];
        for (int i = 0; i < integers.length; i++) {
            newArray[i] = integers[i];
        }
        this.integers = newArray;


        for (int i = 0; i < integers.length; i++) {
            if (integers[i] == null) {
                break;
            }
        }
        return true;
    }

}


//        for (int i = 0; i < size; i++) {
//            if (integers[i] == null) {
//                integers[i] = size

//
//        }


//2.Скопировать со старого массива все значения в новый
//    //3.Присвоить экземпляру MyList новый массив.


