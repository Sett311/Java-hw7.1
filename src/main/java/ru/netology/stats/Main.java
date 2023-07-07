package ru.netology.stats;

public class Main {
    public static void main(String[] args) {
        long[] sales = {
                //8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
                20, 10, 5, 11, 8, 13, 19, 13, 8, 5, 14, 20
        };
        StatsService service = new StatsService();
        System.out.println("1. Сумму всех продаж " + service.getTotalSales(sales));
        System.out.println("2. Средняя сумму продаж в месяц " + service.getAverageSales(sales));
        System.out.println("3. Пик продаж был в " + service.maxSales(sales) + " месяце");
        System.out.println("4. Минимум продаж был в " + service.minSales(sales) + " месяце ");
        System.out.println("5. Количество месяцев, в которых продажи были ниже среднего " + service.getAmountLowSales(sales));
        System.out.println("6. Количество месяцев, в которых продажи были выше среднего " + service.getAmountHiSales(sales));
    }
}