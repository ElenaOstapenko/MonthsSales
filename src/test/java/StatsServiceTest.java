import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {

    @Test
    public void shouldCalculateTotalSales() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 180;
        int actual = service.TotalSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateAverageSales() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        double expected = 15;
        double actual = service.AverageSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateMonthOfMaxSales() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 8;
        int actual = service.maxSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateMonthOfMinSales() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 9;
        int actual = service.minSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateMonthOfLessAverage() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.salesLessAverage(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateMonthOfMoreAverage() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.salesMoreAverage(sales);

        Assertions.assertEquals(expected, actual);
    }
}