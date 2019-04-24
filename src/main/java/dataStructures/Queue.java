package dataStructures;

class FullQueueException extends RuntimeException {}
class EmptyQueueException extends RuntimeException {}

public class Queue<T> {
    private final int capacity;
    private final SinglyLinkedList<T> items;

    Queue(int capacity) {
        this.capacity = capacity;
        this.items = new SinglyLinkedList<>();
    }

    public void enqueue(T item) throws FullQueueException {
        if (items.size() >= capacity) {
            throw new FullQueueException();
        }

        items.add(item);
    }

    public T dequeue() throws EmptyQueueException {
        if (items.size() <= 0) {
            throw new EmptyQueueException();
        }
        T item = items.get(0);
        items.remove(item);
        return item;
    }

    public T peek() throws EmptyQueueException {
        if (items.size() <= 0) {
            throw new EmptyQueueException();
        }
        return items.get(0);
    }
}
