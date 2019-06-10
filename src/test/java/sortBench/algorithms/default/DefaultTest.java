package sortBench.algorithm;

import org.junit.Test;
import static org.junit.Assert.*;

public class DefaultTest {
    private Default defaultSort;

    public DefaultTest() {
        this.defaultSort = new Default();
    }

    private void executeTest(int[] toSort, int[] expected) {
        this.defaultSort.sort(toSort);
        assertArrayEquals(toSort, expected);
    }

    @Test public void testDefaultEmptyArray() {
        this.executeTest(new int[1], new int[1]);
    }

    @Test public void testOneElementArray() {
        int[] toSort = {1};
        int[] expected = {1};

        executeTest(toSort, expected);
    }

    @Test public void testAlreadySortedArray() {
        int[] toSort = {1, 2, 3};
        int[] expected = {1, 2, 3};

        executeTest(toSort, expected);
    }

    @Test public void testUnsortedShortArray() {
        int[] toSort = {3, 2, 1};
        int[] expected = {1, 2, 3};

        executeTest(toSort, expected);
    }

    @Test public void testunsortedMidLongArray() {
        int[] toSort = {4,6,0,3,1,9,2,5,8,7};
        int[] expected = {0,1,2,3,4,5,6,7,8,9};

        executeTest(toSort, expected);
    }

    @Test public void testunsortedArrayWithDuplication() {
        int[] toSort = {4,6,0,4,1,9,2,5,4,0};
        int[] expected = {0,0,1,2,4,4,4,5,6,9};

        executeTest(toSort, expected);
    }
}
