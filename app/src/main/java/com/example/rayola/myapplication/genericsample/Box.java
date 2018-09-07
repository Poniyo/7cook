package com.example.rayola.myapplication.genericsample;

public class Box <T,E> {
    private T data;
    private E data2;

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}
