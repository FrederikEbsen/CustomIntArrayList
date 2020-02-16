package com.company;

import java.util.Arrays;

public class CustomIntArrayList {
    private int[] array;
    private int currentIndex = 0;

    //CONSTRUCTOR (CREATES EMPTY OF SIZE 0)
    public CustomIntArrayList() {
        array = new int[0];
    }

    public int[] returnArray() {
        return array;
    }

    //GET VALUE AT INDEX
    public int get(int index) {
        return array[index];
    }

    //APPEND NEW VALUE
    public void add(int value) {
        int[] copy = Arrays.copyOf(array, array.length + 1);
        copy[currentIndex] = value;
        array = new int[copy.length];
        array = copy;
        currentIndex++;
    }

    //ADD VALUE AT INDEX
    public void add(int value, int index) {
        //IF
    }

    //REMOVE VALUE AT INDEX
    public void remove(int index) {
        if(index < array.length) {
            int[] subarray1 = Arrays.copyOfRange(array, 0, index);
            array = new int[array.length-1];
            array = subarray1;
        }

    }

    //SIZE OF ARRAY
    public int size() {
        return array.length;
    }

    @Override
    public String toString() {
        String output = "";
        for(int i : array) {
            output += i + " ";
        }
        output = output.substring(0,output.length()-1);
        return output;
    }
}
