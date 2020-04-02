package com.baodev;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        long viewCount = 3_123_456_789L;
        float price = 10.99F;
        char letter = 'A';
        boolean isKnowJava = false;
        // This Is For Decalre Primitive Variables
        Date now = new Date();
        // now is for decalre Refrence Variables
        String message = "Hello This Is \"String\"";
        String messageChange = message.replace("String", "Ahihi");
        System.out.println(message);
        System.out.println(messageChange);
        // This is String in Java
        int[] numbers = { 1, 3, 2, 6, 5 };
        Arrays.sort(numbers);
        System.out.println(numbers.length);
        System.out.println(Arrays.toString(numbers));
        int[][] numbers2 = { { 1, 2, 3 }, { 4, 5, 6 } };
        System.out.println(Arrays.deepToString(numbers2));
        // Arrays
        final float PI = 3.14F;
        // Cannot Change Value of PI
        // Const Variables
        double result = (double)10 / (double)3;
        System.out.println(result);
        // Math Operator
        int math = (int) (Math.random() * 100);
        System.out.println(math);
        // Math Class
        String result2 = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(result2);
        // Math Formatting
    }
}
