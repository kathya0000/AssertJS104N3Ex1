package com.testing;

public class SimpleClass {
    public void throwException() {
        int[] array = new int[5];
        int i = array[10]; // Esto lanzará una ArrayIndexOutOfBoundsException
    }
}

