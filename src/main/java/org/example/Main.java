package org.example;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static int summa(Integer integer_a, Integer integer_b){
        System.out.println("Число 1 = " + integer_a);
        System.out.println("Число 2 = " + integer_b);
        int result = integer_a + integer_b;
    return(result);
    }

    public static double del(double a, double b){
        double c = a/b;
        return(c);
    }

    public static String replacement(String string){
        String result = string.replace("a", "b");
        return result;
    }

}