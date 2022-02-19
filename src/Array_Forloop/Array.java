package Array_Forloop;

public class Array {
    public static void main(String[] args) {
        int myNum = 5;
        String website = "Roseleen Study";
        char letter = 'a';
        double dec = 5.99;
        boolean myCard = true;
        System.out.println(myNum + "is the value stored in the myNum variable");
        System.out.println("website");

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 50, 28};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
        for (int i =0; i<array.length; i++)
        {
            if (array[i] % 2 == 0)
            {
                System.out.println(array[i]);

        }
            else{

                System.out.println(array[i] +"is not multiple of 2");
            }
        }

        /*String[] name = {"Roseleen", "Biswal", "Selenium"};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        for (String s : name)
            System.out.println(s);
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
                break;
            } else {
                System.out.println(array[i] + "is not multiple of 2.");

            }*/
        }}