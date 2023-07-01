package ru.netology.stats;

public class StatsService {
    public int getTotalSales(int[] sales) {
        int totalSales = 0;
        for (int sale : sales) {
            totalSales = totalSales + sale;
        }
        return totalSales;
    }

    public int getAverageSales(int[] sales) {
        int totalSales = getTotalSales(sales);
        int averageSales = totalSales / sales.length;
        return averageSales;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
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

    public int minSales(int[] sales) {
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

    public int getAmountLowSales(int[] sales) {
        int amountLowSales = 0; // количество месяцев, ниже средних продаж
        int averageSales = getAverageSales(sales); //средняя продаж
        for (int month = 0; month < sales.length; month++) {
            if (sales[month] < averageSales) {
                amountLowSales = amountLowSales + 1;
            }
        }
        return amountLowSales;
    }

    public int getAmountHiSales(int[] sales) {
        int amountHiSales = 0; // количество месяцев, выше средних продаж
        int averageSales = getAverageSales(sales); //средняя продаж
        for (int month = 0; month < sales.length; month++) {
            if (sales[month] > averageSales) {
                amountHiSales = amountHiSales + 1;
            }
        }
        return amountHiSales;
    }
}
