package day27;

import java.io.*;

public class Serialization_demo1 {
    int a;
    int b;
    String name;

    public Serialization_demo1(int a, int b, String name){
        this.a =a;
        this.b =b;
        this.name =name;
    }


    /* Serialization converts objects into byte stream.
        Byte streams are platform independent.i.e. the serialized objects can be created in one platform
         and can be de-serialized in another platform
         */
    public static void main(String[] args) {
        Serialization_demo1 obj1 = new Serialization_demo1(10, 20, "Rob");
        String filename = "Serialization_demo1.ser";
        //Serialization


        


    }}