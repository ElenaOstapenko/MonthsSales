package ru.netology.stats;

import java.util.Arrays;

public class Main {
    public static void main(String [] args) {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        System.out.println(service.totalSales(sales));
        System.out.println();
        System.out.println(service.averageSales(sales));
        System.out.println();
        System.out.println(service.maxSales(sales));
        System.out.println();
        System.out.println(service.minSales(sales));
        System.out.println();
        System.out.println(service.salesLessAverage(sales));
        System.out.println();
        System.out.println(service.salesMoreAverage(sales));
        System.out.println();
        System.out.println(Arrays.toString(sales));
    }
}