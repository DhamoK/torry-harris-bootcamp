package com.torryharris.model;

public class GenericType<T,E> {
    private T obj;
    private E s;
    public GenericType(T obj,E s){
        this.obj = obj;
        this.s = s;
    }
    public T getObj() {
        return obj;
    }
    public E gets(){
        return s;
    }

}
