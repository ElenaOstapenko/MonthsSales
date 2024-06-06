import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {

    @Test
    public void shouldCalculatetotalSales() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        long expected = 180;
        long actual = service.totalSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateaverageSales() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        long expected = 15;
        long actual = service.averageSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateMonthOfMaxSales() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        long expected = 8;
        long actual = service.maxSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateMonthOfMinSales() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        long expected = 9;
        long actual = service.minSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateMonthOfLessAverage() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        long expected = 5;
        long actual = service.salesLessAverage(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateMonthOfMoreAverage() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        long expected = 5;
        long actual = service.salesMoreAverage(sales);

        Assertions.assertEquals(expected, actual);
    }
}