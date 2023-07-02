package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldFindFailedTest() {
        int [] sales = { 20, 10, 5, 11, 8, 13, 19, 13, 8, 5, 14, 20};
        StatsService service = new StatsService();
        //1
        int expectTotalSales = 146;
        int actualTotalSales = service.getTotalSales(sales);
        Assertions.assertEquals(expectTotalSales, actualTotalSales);

        //2
        int expectAverangeSales = 12;
        int actualAverangeSales = service.getAverageSales(sales);
        Assertions.assertEquals(expectAverangeSales, actualAverangeSales);

        //3
        int expectMaxSales = 12;
        int actualMaxSales = service.maxSales(sales);
        Assertions.assertEquals(expectMaxSales, actualMaxSales);

        //4
        int expectMinSales = 10;
        int actualMinSales = service.minSales(sales);
        Assertions.assertEquals(expectMinSales, actualMinSales);

        //5
        int expectAmountLowSales = 6;
        int actualAmountLowSales = service.getAmountLowSales(sales);
        Assertions.assertEquals(expectAmountLowSales, actualAmountLowSales);

        //6
        int expectAmountHiSales =6;
        int actualAmountHiSales = service.getAmountHiSales(sales);
        Assertions.assertEquals(expectAmountHiSales, actualAmountHiSales);
    }
}
