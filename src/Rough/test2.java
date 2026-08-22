package Rough;

public class test2 {
    public static void main(String[] args) {
        int a = 2;
        int b= 5;
        String c = "india";

        System.out.println("square of a: "+ a*a);
        System.out.println("cube of b "+ cube(b));
        stringPoc(c);

    }

    static int cube(int x){
        return (x*x*x);
    }

    static String stringPoc(String str){
        System.out.println("String chars");
        for( int i =0;i<str.length(); i++){
            System.out.println(str.charAt(i));
        }

        return str;



    }
    }
