package ru.netology.stats;

public class StatsService {
    public long getTotalSales(long[] sales) { // расчёт суммы всех продаж
        long totalSales = 0;
        for (long sale : sales) {
            totalSales = totalSales + sale;
        }
        return totalSales;
    }

    public long getAverageSales(long[] sales) { //расчёт средних продаж
        return getTotalSales(sales) / sales.length;
    }

    public long maxSales(long[] sales) {
        int maxMonth = 0; // месяц, в который был максимальные продажи
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public long minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int getAmountLowSales(long[] sales) {
        int amountLowSales = 0; // количество месяцев, ниже средних продаж
        long averageSales = getAverageSales(sales); //средняя продаж
        for (long sale : sales) {
            if (sale < averageSales) {
                amountLowSales++;
            }
        }
        return amountLowSales;
    }

    public int getAmountHiSales(long[] sales) {
        int amountHiSales = 0; // количество месяцев, выше средних продаж
        long averageSales = getAverageSales(sales); //средняя продаж
        for (long sale : sales) {
            if (sale > averageSales) {
                amountHiSales++;
            }
        }
        return amountHiSales;
    }
}
