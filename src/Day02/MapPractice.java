package Day02;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice {

    public static void main(String[] args) {
        //create a map
        String[] names = {"Oliver", "Jack", "Noah", "Breanna", "Shay","James", "Conor", "Jake", "John"};
        Integer[] salaries = {11000, 105000, 95000, 85000, 100000, 90000, 78000, 118000, 98000};

        Map<String, Integer> employeeMap = new LinkedHashMap<>(); //LinkedHashMap--> DOES INSERTION ORDER

        for (int i = 0; i < names.length; i++) {
            employeeMap.put(names[i],salaries[i]);
        }
        System.out.println(employeeMap);

        System.out.println("---------------------------");

        //Let's Iterate map !!!IMPORTANT
        //1-by keys
        for (String eachKey: employeeMap.keySet()) {
            System.out.println(eachKey);
        }

        System.out.println("---------------------------");

        //2- by values
        for (Integer eachValue : employeeMap.values()) {
            System.out.println(eachValue);
        }

        System.out.println("---------------------------");

        //3-by Entry / by keys and values !!!IMPORTANT
        for (Map.Entry<String, Integer> eachEntry : employeeMap.entrySet()) {
            //System.out.println(eachEntry);
            System.out.println(eachEntry.getKey()+":"+eachEntry.getValue());

        }
        System.out.println("---------------------------");

        //SHORT WAY lambda expression
        employeeMap.forEach((k, v) ->{ System.out.println(k+" : "+ v); });

        //let's print if salary < 100000
        employeeMap.forEach((k, v) ->{ if(v<100000)  System.out.println(k+" : "+ v); });

    }
}
