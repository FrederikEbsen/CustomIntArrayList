package com.company;

public class Main {

    public static void main(String[] args) {
	    CustomIntArrayList arrayList = new CustomIntArrayList();
        for (int i = 0; i < 5; i++) {
            arrayList.add(i);
        }
        arrayList.add(7);

        for(int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        System.out.println(arrayList.toString());
        arrayList.remove(5);
        System.out.println(arrayList.toString());
    }
}
