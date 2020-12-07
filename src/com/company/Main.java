package com.company;

public class Main {

    public static void main(String[] args) {
        int newArray[] = {1, 2, 3, 4, 5};
        try {
            for (int count = 0; count < newArray.length; count++) {
                System.out.println(newArray[count]);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            cloneArray(newArray);
        }
    }

    private static void cloneArray(int[] newArray) {
        int clonedArray[] = newArray.clone();
        try {
            for (int count = 0; count < clonedArray.length; count++) {
                System.out.println(clonedArray[count]);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
