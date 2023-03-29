package org.example;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException {
        System.out.println("Hello world!");
        division(5, 5);
    }

    public static int sum(Integer integer_a, Integer integer_b) {
        System.out.println("Число 1 = " + integer_a);
        System.out.println("Число 2 = " + integer_b);
        int result = integer_a + integer_b;
        return (result);
    }

    public static double division(double a, double b) throws NoSuchMethodException {
        double c = a / b;
        if (b == 0) {
            throw new NoSuchMethodException();
        } return c;
    }

    public static String replacement(String string){
        String result = string.replace("a", "b");
        return result;
    }
}