package map;

import java.util.HashMap;
import java.util.Map;

public class Map2 {
    public static void main(String[] args) {
        Map<String, String> automationFramework = new HashMap<>();
        automationFramework.put("language", "Java");
        automationFramework.put("testing library", "Selenium");
        automationFramework.put("BDD", "Cucumber");
        automationFramework.put("testing library", "Python");
        automationFramework.put("testing library", "C#");

        System.out.println(automationFramework.size());
        System.out.println(automationFramework.get("testing library"));
        System.out.println(automationFramework.entrySet());
        System.out.println(automationFramework.keySet());
        System.out.println(automationFramework.values());
}}
