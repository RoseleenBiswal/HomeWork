package Strings;

public class Strings
{
    public static void main(String[] args) {
          String s = "Welcome to the automation World";
          String [] splittedString =s.split("the");

        //System.out.println(splittedString[0]);
        System.out.println(splittedString[0]);
        //System.out.println(splittedString[1]);
        System.out.println(splittedString[1].trim());

       /* for (int i =0; i<s.length(); i++)
        {
            System.out.println(s.charAt(i));
    }*/
        for (int i =s.length()-1; i<s.length(); i--)
        {
            System.out.println(s.charAt(i));

        }
}}
