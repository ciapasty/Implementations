package dataStructures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    Stack<String> stack;

    @BeforeEach
    void init() {
        stack = new Stack<>(3);
    }

    @Test
    void addAndPeek() {
        stack.add("1");
        assertEquals(stack.peek(), "1");

        stack.add("2");
        assertEquals(stack.peek(), "2");

        stack.add("3");
        assertEquals(stack.peek(), "3");

        assertThrows(IndexOutOfBoundsException.class, () -> stack.add("4"));
    }

    @Test
    void pop() {
        stack.add("1");
        stack.add("2");
        stack.add("3");
        assertEquals(stack.pop(), "3");
        assertEquals(stack.pop(), "2");
        assertEquals(stack.pop(), "1");

        assertThrows(EmptyStackException.class, () -> stack.pop());

    }

    @Test
    void peekThrowsExceptionOnEmpty() {
        assertThrows(EmptyStackException.class, () -> stack.peek());
    }
}