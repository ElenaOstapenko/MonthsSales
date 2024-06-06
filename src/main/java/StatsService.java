package ru.netology.stats;

public class StatsService {

    //сумма всех продаж
    public long totalSales(long[] sales) {
        long sum = 0;
        for (long value : sales) {
            sum += value;
        }
        return sum;
    }

    // средняя сумма продаж в месяц
    public long averageSales(long[] sales) {
        return (long) totalSales (sales) / sales.length;
    }

    //номер месяца, в котором был пик продаж
    public long maxSales(long[] sales) {
        long maxMonth = 0; // номер месяца с максимальными продажами, просмотренными ранее
        for (long i = 0; i < 12; i++) {
            if (sales[i] >= sales[maxMonth]) { //в рассматриваемом месяце продаж больше
                maxMonth = i;
            }
        }
        return maxMonth + 1; //месяца нумеруются с 1, а индексы массива с 0, поэтому нужно сдвинуть на 1
    }

    //номер месяца, в котором был минимум продаж
    public long minSales(long[] sales) {
        long minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (long i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }
        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    //количество месяцев, в которых продажи были ниже среднего
    public long salesLessAverage(long[] sales) {
        long numberOfMonth = 0;
        long averageSales = averageSales(sales);
        for (long i = 0; i < 12; i++) {
            if (sales < averageSales) {
                numberOfMonth = numberOfMonth + 1;
            }
        }
        return numberOfMonth;
    }
    //количество месяцев, в которых продажи были выше среднего

    public long salesMoreAverage(long[] sales) {
        long numberOfMonth = 0;
        long averageSales = averageSales(sales);
        for (long i = 0; i < 12; i++) {
            if (sales > averageSales) {
                numberOfMonth = numberOfMonth + 1;
            }
        }
        return numberOfMonth;
    }
}