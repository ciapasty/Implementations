package dataStructures;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class BinarySearchTreeTest {

    private static BinarySearchTree<String> bt;

    @BeforeAll
    static void initAll() {
        bt = new BinarySearchTree<String>();
    }

    @Test
    public void insertAndFindValues() {

        bt.insert("d");
        assertEquals(bt.find("d"), "d");

        bt.insert("b");
        assertEquals(bt.find("b"), "b");

        bt.insert("e");
        assertEquals(bt.find("e"), "e");

        bt.insert("a");
        assertEquals(bt.find("a"), "a");

        bt.insert("b");
        assertEquals(bt.find("b"), "b");

        bt.insert("f");
        assertEquals(bt.find("f"), "f");
    }

    @Test
    public void min() {
        assertEquals(bt.min(), "a");
    }

    @Test
    public void max() {
        assertEquals(bt.max(), "f");
    }
}