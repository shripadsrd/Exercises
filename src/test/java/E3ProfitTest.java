import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class E3ProfitTest {

    @Test
    public void profitTest1() {
        final E3Profit e3Profit = new E3Profit();
        final ArrayList<Integer> list = new ArrayList<Integer>() {{
            add(310);
            add(315);
            add(275);
            add(295);
            add(260);
            add(270);
            add(290);
            add(230);
        }};
        Assert.assertEquals(Integer.valueOf(30), e3Profit.bestProfit(list));
    }

}
