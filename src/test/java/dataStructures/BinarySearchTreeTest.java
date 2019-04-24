package dataStructures;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BinarySearchTreeTest {

    private static BinarySearchTree<String> bt;

    @BeforeEach
    void init() {
        bt = new BinarySearchTree<String>();
        bt.insert("d");
        bt.insert("b");
        bt.insert("e");
        bt.insert("a");
        bt.insert("c");
        bt.insert("f");
    }

    @Test
    public void insertAndFindValue() {
        bt.insert("g");
        assertEquals(bt.find("g"), "g");
    }

    @Test
    public void min() {
        assertEquals(bt.min(), "a");
    }

    @Test
    public void max() {
        assertEquals(bt.max(), "e");
    }
}