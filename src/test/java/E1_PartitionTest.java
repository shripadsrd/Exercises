import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class E1_PartitionTest {

    @Test
    public void partitionTest_sampleArray() {
        final E1_Parition partition = new E1_Parition();
        final int index = 4;
        final ArrayList<Integer> list = new ArrayList<Integer>() {{
            add(1);
            add(6);
            add(3);
            add(5);
            add(5);
            add(4);
            add(9);
            add(2);
            add(6);
        }};
        final ArrayList<Integer> returnList = new ArrayList<Integer>() {{
            add(1);
            add(2);
            add(3);
            add(4);
            add(5);
            add(5);
            add(9);
            add(6);
            add(6);
        }};
        final ArrayList<Integer> partitionedList = partition.partition(list, index);
        Assert.assertArrayEquals(returnList.toArray(), partitionedList.toArray());
//        System.out.println(partitionedList.toString());
    }
}
