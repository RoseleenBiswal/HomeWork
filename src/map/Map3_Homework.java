package map;

import java.util.*;

public class Map3_Homework {
    public static void main(String[] args) {
        Map<String, String> employee = new HashMap<>();
        employee.put("Name", "Rob");
        employee.put("City", "London");
        employee.put("Age", "50");
        employee.put("Division", "Data Science");
        employee.put("Grade", "D");

        Collection<String> values = employee.values();
        System.out.println(values);

        //Map<String, List<String>> employee = new HashMap<String, List<String>>();
        //List<String> list = new ArrayList<String>();


    }
}
