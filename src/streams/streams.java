package streams;

import java.util.*;
import java.util.stream.*;


public class streams {
    public static void main(String[] args) {


        List<String> strings =new ArrayList<String>();
        strings.add("I");
        strings.add("hell there");
        strings.add("ok ok");
        strings.add("umm");

        for(String str: strings)
            System.out.println(str);

        System.out.println("Printing using for each and laambda");

        strings.forEach(str -> System.out.println(str));


        System.out.println("Using filter method to print only first 3 string in list");


        List<String> result = strings.stream().limit(3).collect(Collectors.toList());
        System.out.println("Result : "+result);


        List<String> items= Arrays.asList("Fruits", "Chips");

        items.forEach(item-> System.out.println(item));
        items.forEach(item-> System.out.println(item.toLowerCase()));
        //System.out.println(items.sort());


//list of is modern way of initialising list from java 9  
        List<String> items2= List.of("fruits2","chips2", "rishabh","india");
        items2.forEach(item-> System.out.println(item));

        List<String> result2 = items2.stream().filter(i -> i.startsWith("i")).collect(Collectors.toList());
        result2.forEach(item-> System.out.println("Filtered "+item));

    }
    }








