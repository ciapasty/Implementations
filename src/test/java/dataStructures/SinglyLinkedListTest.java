package dataStructures;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class SinglyLinkedListTest {

    @Test
    public void sizeIsZeroAfterInitialization() {
        SinglyLinkedList<String> list = new SinglyLinkedList<String>();
        assertEquals(list.size(), 0);
    }

    @Test
    public void sizeIncreasesAfterAdd() {
        SinglyLinkedList<String> list = new SinglyLinkedList<String>();
        list.add("1");
        assertEquals(list.size(), 1);

        list.add("2");
        assertEquals(list.size(), 2);

        list.add("3");
        assertEquals(list.size(), 3);
    }

    @Test
    public void sizeDecreasesAfterRemove() {
        SinglyLinkedList<String> list = new SinglyLinkedList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        assertEquals(list.size(), 3);
        list.remove("1");
        assertEquals(list.size(), 2);
        list.remove("2");
        assertEquals(list.size(), 1);
    }

    @Test
    public void getReturnsAddedValue() {
        SinglyLinkedList<String> list = new SinglyLinkedList<String>();
        list.add("1");
        assertEquals(list.get(0), "1");
        list.add("2");
        assertEquals(list.get(1), "2");
    }

    @Test
    public void getThrowsIndexOutOfBoundsExceptionOnEmptyList() {
        SinglyLinkedList<String> list = new SinglyLinkedList<String>();
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(0));
    }

    @Test
    public void getThrowsIndexOutOfBoundsExceptionOnWrongIndex() {
        SinglyLinkedList<String> list = new SinglyLinkedList<String>();
        list.add("1");
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(1));
    }

    @Test
    public void addFirstAddsOnBeginning() {
        SinglyLinkedList<String> list = new SinglyLinkedList<String>();
        list.add("1");
        assertEquals(list.size(), 1);
        list.addFirst("2");
        assertEquals(list.size(), 2);
        assertEquals(list.get(0), "2");
    }

    @Test
    public void addLastAddsAsOnEnd() {
        SinglyLinkedList<String> list = new SinglyLinkedList<String>();
        list.add("1");
        list.addLast("2");
        assertEquals(list.get(1), "2");
    }

    @Test
    public void removeReturnsRemovedItem() {
        SinglyLinkedList<String> list = new SinglyLinkedList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        assertSame(list.remove("1"), "1");
        assertSame(list.remove("3"), "3");
    }

    @Test
    public void removeReturnsNullOnEmptyList() {
        SinglyLinkedList<String> list = new SinglyLinkedList<String>();
        assertNull(list.remove("1"));
    }

    @Test
    public void removeReturnsNullOnNonExistingItem() {
        SinglyLinkedList<String> list = new SinglyLinkedList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        assertNull(list.remove("4"));
    }

    @Test
    public void afterClearSizeIsZero() {
        SinglyLinkedList<String> list = new SinglyLinkedList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        assertEquals(list.size(), 3);
        list.clear();
        assertEquals(list.size(), 0);
    }

    @Test
    public void containsReturnTrueOnItemInListAndFalseOtherwise() {
        SinglyLinkedList<String> list = new SinglyLinkedList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        assertTrue(list.contains("2"));
        assertFalse(list.contains("4"));
    }

    @Test
    public void getIndexOf() {
        SinglyLinkedList<String> list = new SinglyLinkedList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        assertEquals(list.indexOf("1"), 0);
        assertEquals(list.indexOf("2"), 1);
        assertEquals(list.indexOf("3"), 2);
        assertEquals(list.indexOf("4"), -1);
    }

    @Disabled
    @Test
    public void toArrayTest() {
        SinglyLinkedList<String> list = new SinglyLinkedList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        assertEquals(list.toArray(), new String[] {"1", "2", "3"});
    }

    @Test
    public void toStringTest() {
        SinglyLinkedList<String> list = new SinglyLinkedList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        assertEquals(list.toString(), "[1, 2, 3]");
    }
}