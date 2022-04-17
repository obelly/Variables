package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        task3();
    }

    public static void task1() {
        Scanner scanner = new Scanner(System.in);
        //Задание 1
        int a;
        double b, result, result2;
        a = scanner.nextInt();
        b = scanner.nextInt();
        result = a/b;
        result2 = a%b;
        System.out.println("Результат деления = " + result + ", Остаток от деления = " + result2);
    }
    public static void task2() {
        Scanner scanner = new Scanner(System.in);
        // Задание 2
        int a;
        double b, result;
        a = scanner.nextInt();
        b = scanner.nextInt();
        result = (5 * a + b * b) / (b - a);
        System.out.println("Результат = " + result);
    }
    public static void task3() {
        Scanner scanner = new Scanner(System.in);
        // Задание 3
        String A, B, C;
        A = scanner.next();
        B = scanner.next();
        C = A;
        System.out.println(A = B);
        System.out.println(B = C);
    }
    public static void task4() {
        Scanner scanner = new Scanner(System.in);
        // Задание 4
        int a, b, c, answer;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        answer = (c - b) / a;
        System.out.println("ответ = " + answer);
    }
    public static void task5() {
        Scanner scanner = new Scanner(System.in);
        // Задание 5
        double y1, y2, x1, x2, A, B;
        y1 = scanner.nextDouble();
        y2 = scanner.nextDouble();
        x1 = scanner.nextDouble();
        x2 = scanner.nextDouble();
        A = (y1 - y2) / (x1 - x2);
        B = y2 - A * x2;
        System.out.print("Уравнение прямой: Y =" + A + "x+" + B);
    }



}
