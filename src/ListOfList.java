import java.util.ArrayList;
import java.util.List;

public class ListOfList
{
    public static void main(String[] args) {
        List<String> cat = new ArrayList<>();
        cat.add("Tabby");
        cat.add("Tin");
        cat.add("Shabby");
        cat.add("Micky");


        List<String> dog = new ArrayList<>();
        dog.add("Tom");
        dog.add("Dyke");
        dog.add("Jack");
        dog.add("Posh");

        List<List<String>> mainList = new ArrayList<>();
        mainList.add(cat);
        mainList.add(dog);

        for (List<String> stringList : mainList) {
            for (String element : stringList) {
                System.out.println(element + " ");
            }
            System.out.println();
            System.out.println("I am the list.");
        }
    }
}

