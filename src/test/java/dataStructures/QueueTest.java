package dataStructures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

    Queue<String> queue;

    @BeforeEach
    void init() {
        queue = new Queue<>(3);
    }

    @Test
    void enqueueAndPeek() {
        queue.enqueue("1");
        assertEquals(queue.peek(), "1");

        queue.enqueue("2");
        assertEquals(queue.peek(), "1");

        queue.enqueue("3");
        assertEquals(queue.peek(), "1");

        assertThrows(RuntimeException.class, () -> queue.enqueue("4"));
    }

    @Test
    void dequeue() {
        queue.enqueue("1");
        queue.enqueue("2");
        queue.enqueue("3");

        assertEquals(queue.dequeue(), "1");
        assertEquals(queue.dequeue(), "2");
        assertEquals(queue.dequeue(), "3");

        assertThrows(RuntimeException.class, () -> queue.dequeue());
    }

    @Test
    void peekThrowsExceptinOnEmpty() {
        assertThrows(RuntimeException.class, () -> queue.peek());
    }
}