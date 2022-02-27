package map;

import java.util.*;

public class Map1 {
    public static void main(String[] args) {
        Map<String, String> automationFrameworkTools = new HashMap<>();
        automationFrameworkTools.put("language", "Java");
        automationFrameworkTools.put("test library", "Selenium");
        automationFrameworkTools.put("BDD library", "Cucumber");
        automationFrameworkTools.put("Unit Testing tool","TestNG");
        automationFrameworkTools.put("framework", "Hybrid");
        automationFrameworkTools.put("Build tool", "Maven");
        automationFrameworkTools.put("CI tool", "Jenkins");
        automationFrameworkTools.put("repo", "Git");
        automationFrameworkTools.put("report", "extent");
        automationFrameworkTools.put("log","log4J");

        System.out.println(automationFrameworkTools.get("language"));


        System.out.println(automationFrameworkTools.entrySet());
        Set<String> keys = automationFrameworkTools.keySet();
        // Set<String> keys = automationFrameworkTools.keySet();
        System.out.println(keys);

        //Collection<String> values = automationFrameworkTools.values();
        Collection<String> values = automationFrameworkTools.values();
        System.out.println(values);

        System.out.println();
        System.out.println("Using foreach loop");

        for (String key:keys){
            System.out.println(automationFrameworkTools.get(key));
        }



    }
}
