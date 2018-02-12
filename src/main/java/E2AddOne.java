import java.util.ArrayList;

public class E2AddOne {

    ArrayList<Integer> addOne(final ArrayList<Integer> array) {

        for (int i = array.size() - 1; i >= 0; i--) {
            if (array.get(i) < 9) {
                array.set(i, array.get(i) + 1);
                return array;
            }
            array.set(i, 0);
        }

        /* I am creating another array to add 1 at the front,
         * you can easily modify array to shift elements to add the 1 if space is important
         */
        final ArrayList<Integer> returnArray = new ArrayList<Integer>();
        returnArray.add(1);
        returnArray.addAll(array);
        return returnArray;
    }
}
