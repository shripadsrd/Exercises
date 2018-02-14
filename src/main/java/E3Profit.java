import java.util.ArrayList;
import java.util.Collections;

public class E3Profit {

    Integer bestProfit(final ArrayList<Integer> array) {

        int min = array.get(0);
        int diff = 0;

        for(int i = 1; i<array.size(); i++) {
            min = array.get(i) < min ? array.get(i) : min;
            diff = array.get(i) - min > diff ? array.get(i) - min : diff;
        }
        return diff;
    }
}
