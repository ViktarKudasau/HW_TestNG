package org.example;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(summa());
        System.out.println(del());
        System.out.println(replacement("aaaaa"));
    }

    public static int summa(){
    int a = 2;
    int b = 3;
    return(a+b);
    }

    public static double del(){
        double a = 3;
        double b = 2;
        double c = a/b;
        return(c);
    }

    public static String replacement(String string){

        String result = string.replace("a", "b");
        return result;
    }

}