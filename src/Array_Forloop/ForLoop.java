package Array_Forloop;

import java.util.Arrays;

public class ForLoop{
    public static void main(String[] args)
    {
        System.out.println( "I am the main method.");

        int [] array =new int [9];
        array [0]= 7;
        array [1]= 2;
        array [2]= 4;
        array [3]= 6;
        array [4]= 5;
        array [5]= 6;
        array [6]=8;
        array [7]=72;
        int [] array2 ={1,2,3,4,5,6,8,5,4,80};
        System.out.println(array2.length);
        System.out.println(Arrays.stream(array).min());
        System.out.println(array[2]);
    }

    }





