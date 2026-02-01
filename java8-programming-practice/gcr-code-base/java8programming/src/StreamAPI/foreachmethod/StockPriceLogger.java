package StreamAPI.foreachmethod;

import java.util.*;

public class StockPriceLogger {

    public static void main(String[] args) {

        List<Double> stockPrices =
                Arrays.asList(450.5, 452.8, 449.2, 455.6);

        stockPrices.forEach(price ->
                System.out.println("Live Stock Price: ₹" + price)
        );
    }
}
