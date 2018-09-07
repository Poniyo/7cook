package com.example.rayola.myapplication.genericsample;

public class Parking<T extends Car> {
    private T car;

    public void setCar(T car) {
        this.car = car;
    }

    public T getCar() {
        return car;
    }
    //میتونیم محدود کنیم جنریک رو به اون چیزایی که میخوایم ساپورت کنیم
}
