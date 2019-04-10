package dataStructures;

public class Queue<T> {
    int capacity;
    SinglyLinkedList<T> items;

    Queue(int capacity) {
        this.capacity = capacity;
        this.items = new SinglyLinkedList<>();
    }

    public void enqueue(T item) throws RuntimeException {
        if (items.size() == capacity) {
            throw new RuntimeException("Queue is full");
        }

        items.add(item);
    }

    public T dequeue() throws RuntimeException {
        if (items.size() == 0) {
            throw new RuntimeException("Queue is empty");
        }
        T item = items.get(0);
        items.remove(item);
        return item;
    }

    public T peek() throws RuntimeException {
        if (items.size() == 0) {
            throw new RuntimeException("Queue is empty");
        }
        return items.get(0);
    }
}
