import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class E2AddOneTest {

    @Test
    public void addOneTest1() {
        final E2AddOne addOne = new E2AddOne();
        final ArrayList<Integer> list = new ArrayList<Integer>() {{
            add(1);
            add(6);
            add(3);
        }};
        final ArrayList<Integer> returnList = new ArrayList<Integer>() {{
            add(1);
            add(6);
            add(4);
        }};
        final ArrayList<Integer> onePlusList = addOne.addOne(list);
        Assert.assertArrayEquals(returnList.toArray(), onePlusList.toArray());
    }

    @Test
    public void addOneTest2() {
        final E2AddOne addOne = new E2AddOne();
        final ArrayList<Integer> list = new ArrayList<Integer>() {{
            add(1);
            add(6);
            add(9);
        }};
        final ArrayList<Integer> returnList = new ArrayList<Integer>() {{
            add(1);
            add(7);
            add(0);
        }};
        final ArrayList<Integer> onePlusList = addOne.addOne(list);
        Assert.assertArrayEquals(returnList.toArray(), onePlusList.toArray());
    }

    @Test
    public void addOneTest3() {
        final E2AddOne addOne = new E2AddOne();
        final ArrayList<Integer> list = new ArrayList<Integer>() {{
            add(9);
            add(9);
            add(9);
        }};
        final ArrayList<Integer> returnList = new ArrayList<Integer>() {{
            add(1);
            add(0);
            add(0);
            add(0);
        }};
        final ArrayList<Integer> onePlusList = addOne.addOne(list);
        Assert.assertArrayEquals(returnList.toArray(), onePlusList.toArray());
    }

    @Test
    public void addOneTest4() {
        final E2AddOne addOne = new E2AddOne();
        final ArrayList<Integer> list = new ArrayList<Integer>() {{
            add(9);
            add(7);
            add(9);
        }};
        final ArrayList<Integer> returnList = new ArrayList<Integer>() {{
            add(9);
            add(8);
            add(0);
        }};
        final ArrayList<Integer> onePlusList = addOne.addOne(list);
        Assert.assertArrayEquals(returnList.toArray(), onePlusList.toArray());
    }

    @Test
    public void addOneTest5() {
        final E2AddOne addOne = new E2AddOne();
        final ArrayList<Integer> list = new ArrayList<Integer>() {{
            add(8);
            add(9);
            add(9);
        }};
        final ArrayList<Integer> returnList = new ArrayList<Integer>() {{
            add(9);
            add(0);
            add(0);
        }};
        final ArrayList<Integer> onePlusList = addOne.addOne(list);
        Assert.assertArrayEquals(returnList.toArray(), onePlusList.toArray());
    }

    @Test
    public void addOneTest6() {
        final E2AddOne addOne = new E2AddOne();
        final ArrayList<Integer> list = new ArrayList<Integer>() {{
            add(0);
            add(0);
            add(0);
        }};
        final ArrayList<Integer> returnList = new ArrayList<Integer>() {{
            add(0);
            add(0);
            add(1);
        }};
        final ArrayList<Integer> onePlusList = addOne.addOne(list);
        Assert.assertArrayEquals(returnList.toArray(), onePlusList.toArray());
    }
}
