package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldFindFailedTest() {
        long [] sales = { 20, 10, 5, 11, 8, 13, 19, 13, 8, 5, 14, 20};
        StatsService service = new StatsService();
        //1
        long expectTotalSales = 146;
        long actualTotalSales = service.getTotalSales(sales);
        Assertions.assertEquals(expectTotalSales, actualTotalSales);

        //2
        long expectAverangeSales = 12;
        long actualAverangeSales = service.getAverageSales(sales);
        Assertions.assertEquals(expectAverangeSales, actualAverangeSales);

        //3
        long expectMaxSales = 12;
        long actualMaxSales = service.maxSales(sales);
        Assertions.assertEquals(expectMaxSales, actualMaxSales);

        //4
        long expectMinSales = 10;
        long actualMinSales = service.minSales(sales);
        Assertions.assertEquals(expectMinSales, actualMinSales);

        //5
        long expectAmountLowSales = 6;
        long actualAmountLowSales = service.getAmountLowSales(sales);
        Assertions.assertEquals(expectAmountLowSales, actualAmountLowSales);

        //6
        long expectAmountHiSales =6;
        long actualAmountHiSales = service.getAmountHiSales(sales);
        Assertions.assertEquals(expectAmountHiSales, actualAmountHiSales);
    }
}
