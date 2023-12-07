package generics;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortedListTests {

    /*/
    @Test
    public void testSize() {
        SortedList<Integer> sl = new SortedList<>();
        assertEquals(0, sl.size());
        sl.insert(Integer.valueOf(10));
        assertEquals(1, sl.size());
        sl.insert(Integer.valueOf(0));
        assertEquals(2, sl.size());
    }

    @Test(timeout = 1000)
    public void testToArray() {
        SortedList<Integer> sl = new SortedList<>();
        sl.insert(Integer.valueOf(5));
        sl.insert(Integer.valueOf(3));
        Integer[] array = new Integer[2];
        sl.toArray(array);
        assertTrue(array[0] == 5 || array[0] == 3);
        assertTrue(array[1] == 5 || array[1] == 3);

        SortedList<String> slStr = new SortedList<>();
        slStr.insert("hello");
        slStr.insert("world");
        String[] strArray = new String[2];
        slStr.toArray(strArray);
        assertTrue(strArray[0].equals("hello") || strArray[0].equals("world"));
        assertTrue(strArray[1].equals("hello") || strArray[1].equals("world"));
    }

    @Test(timeout = 1000)
    public void testInsert() {
        SortedList<Integer> sl = new SortedList<>();
        sl.insert(Integer.valueOf(7));
        sl.insert(Integer.valueOf(3));
        sl.insert(Integer.valueOf(8));
        sl.insert(Integer.valueOf(1));

        assertEquals(4, sl.size());
        Integer[] array = new Integer[sl.size()];
        sl.toArray(array);
        assertArrayEquals(array, new Integer[] {1, 3, 7, 8});

        SortedList<String> slStr = new SortedList<>();
        slStr.insert("e");
        slStr.insert("d");
        slStr.insert("c");
        slStr.insert("b");
        slStr.insert("a");
        assertEquals(5, slStr.size());
        String[] arrayStr = new String[slStr.size()];
        slStr.toArray(arrayStr);
        assertArrayEquals(arrayStr, new String[] {"a", "b", "c", "d", "e" });

    }

    */
}
