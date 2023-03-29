package org.example;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException {
        System.out.println("Hello world!");

/*        division(5, 5);
        sum(1,2);
        replacement("Fantastic");
        System.out.println(sum(5,5));
        System.out.println(replacement("aha"));
 */
    }

    public static int sum(Integer a, Integer b) {
        int result = a + b;
        return (result);
    }

    public static double division(double a, double b) throws NoSuchMethodException {
        double c = a / b;
        if (b == 0) {
            throw new NoSuchMethodException();
        } return c;
    }

    public static String replacement(String a){
        String result = a.replace("a", "b");
        return result;
    }
}