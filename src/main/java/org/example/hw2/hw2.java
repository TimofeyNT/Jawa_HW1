package org.example.hw2;

import java.util.Scanner;

/**
 * Дана последовательность целых чисел, оканчивающаяся нулем. Найти сумму положительных чисел,
 * после которых следует отрицательное число.
 * Пример ввода:
 * 1 2 1 2 -1 1 3 1 3 -1 0
 * Логика расчета:
 * 2 -1 переход -> 2 в сумму
 * 3 -1 переход -> 3 в сумму
 * Пример вывода: 5
 */
public class hw2 {
    public static void main(String[] args) {
        Scanner sacan = new Scanner(System.in);
        int sum = 0;
        System.out.println("Вводите числа: ");

        int a = sacan.nextInt();
        if (a != 0) {
            boolean flag = true;
            while (flag){
                int b = sacan.nextInt();
                if (b != 0){
                    if (a > 0 && b < 0){
                        sum += a;
                    }
                    a = b;
                } else {
                    System.out.println("Сумма = " + sum);
                    flag = false;
                }
            }
        } else {
            System.out.println(0);}
        sacan.close();
    }
}