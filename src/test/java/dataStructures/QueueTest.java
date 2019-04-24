package dataStructures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sun.invoke.empty.Empty;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

    Queue<String> queue;

    @BeforeEach
    void init() {
        queue = new Queue<>(3);
        queue.enqueue("1");
        queue.enqueue("2");
    }

    @Test
    void enqueueAndPeek() {
        queue.enqueue("3");
        assertEquals(queue.peek(), "1");

        assertThrows(FullQueueException.class, () -> queue.enqueue("4"));
    }

    @Test
    void dequeue() {
        assertEquals(queue.dequeue(), "1");
        assertEquals(queue.dequeue(), "2");

        assertThrows(EmptyQueueException.class, () -> queue.dequeue());
    }

    @Test
    void peekThrowsEmptyQueueException() {
        queue = new Queue<>(1);
        assertThrows(EmptyQueueException.class, () -> queue.peek());
    }
}