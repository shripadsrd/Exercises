import java.util.ArrayList;
import java.util.Collections;

public class E1Partition {

    ArrayList<Integer> partition(final ArrayList<Integer> originalArray, final int index) {
        final ArrayList<Integer> array = originalArray;

        int equal = 0;
        int smaller = 0;
        int larger = array.size() - 1;
        final int pivot = array.get(index);

        while (equal < larger) {
            if (array.get(equal) < pivot) {
                Collections.swap(array, equal++, smaller++);
            } else if (array.get(equal) == pivot) {
                equal++;
            } else {
                Collections.swap(array, equal, larger--);
            }
        }
        return array;
    }
}
