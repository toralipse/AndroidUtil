package com.toralipse.myapp.androidutil.models;

/**
 * Created by toralipse on 2016/12/19.
 */
public class Sample{
    private String key;
    private String value;

    public Sample(String key,String value){
        setKey(key);
        setValue(value);
    }
    public static Sample apply(String key,String value){
        return new Sample(key,value);
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}