package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

    }







}
