package ru.netology.stats;

public class StatsService {

    //сумма всех продаж
    public int TotalSales(int[] sales) {
        int sum = 0;
        for (int value : sales) {
            sum += value;
        }
        return sum;
    }

    // средняя сумма продаж в месяц
    public double AverageSales(int[] sales) {
        return (double) TotalSales(sales) / sales.length;
    }

    //номер месяца, в котором был пик продаж
    public int maxSales(int[] sales) {
        int maxMonth = 0; // номер месяца с максимальными продажами, просмотренными ранее
        for (int i = 0; i < 12; i++) {
            if (sales[i] >= sales[maxMonth]) { //в рассматриваемом месяце продаж больше
                maxMonth = i;
            }
        }
        return maxMonth + 1; //месяца нумеруются с 1, а индексы массива с 0, поэтому нужно сдвинуть на 1
    }

    //номер месяца, в котором был минимум продаж
    public int minSales(int[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }
        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    //количество месяцев, в которых продажи были ниже среднего
    public int salesLessAverage(int[] sales) {
        int numberOfMonth = 0;
        double averageSales = AverageSales(sales);
        for (int i = 0; i < 12; i++) {
            if (sales[i] < averageSales) {
                numberOfMonth = numberOfMonth + 1;
            }
        }
        return numberOfMonth;
    }
    //количество месяцев, в которых продажи были выше среднего

    public int salesMoreAverage(int[] sales) {
        int numberOfMonth = 0;
        double averageSales = AverageSales(sales);
        for (int i = 0; i < 12; i++) {
            if (sales[i] > averageSales) {
                numberOfMonth = numberOfMonth + 1;
            }
        }
        return numberOfMonth;
    }
}