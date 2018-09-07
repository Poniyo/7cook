package com.example.rayola.myapplication.genericsample;

import java.util.List;

public class GenericMethodSample {
    public static <T> void printArray(List<T> array){
        for (int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i));
        }

    }

    public static <T> T Print(T data){
        return data;
    }
}
