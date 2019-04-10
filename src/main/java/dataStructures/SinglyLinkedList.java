package dataStructures;

public class SinglyLinkedList<T> {
    class Node<D> {
        D item;
        Node<D> next;

        Node(D item) {
            this.item = item;
        }
    }

    private Node<T> head = null;
    private int size = 0;


    public int size() {
        return size;
    }

    public void add(T item) {
        if (head == null) {
            head = new Node<>(item);
            size++;
        } else {
            Node<T> node = head;
            while (node.next != null) {
                node = node.next;
            }
            node.next = new Node<>(item);
            size++;
        }
    }

    public void addFirst(T item) {
        Node<T> node = new Node<>(item);
        node.next = head;
        head = node;
        size++;
    }

    public void addLast(T item) {
        add(item);
    }

    public T get(int index) throws IndexOutOfBoundsException {
        if (head == null) {
            throw new IndexOutOfBoundsException();
        }

        Node<T> node = head;
        for (int i = 0; i < index; i++) {
            if (node.next == null) {
                throw new IndexOutOfBoundsException();
            } else {
                node = node.next;
            }
        }
        return node.item;
    }

    public T remove(T item) {
        Node<T> node = head;
        Node<T> prev = null;
        if (head == null) {
            return null;
        }
        while (node != null) {
            if (node.item.equals(item)) {
                size--;
                if (prev == null) {
                    head = node.next;
                    return node.item;
                } else {
                    prev.next = node.next;
                    return node.item;
                }
            } else {
                prev = node; // Missed line
                node = node.next;
            }
        }
        return null;
    }

    public boolean contains(T item) {
        Node<T> node = head;
        while (node != null) {
            if (node.item.equals(item)) {
                return true;
            }
            node = node.next;
        }
        return false;
    }

    public int indexOf(T item) {
        Node<T> node = head;
        for (int i = 0; i < size; i++) {
            if (node.item.equals(item)) {
                return i;
            }
            node = node.next;
        }

        return -1;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public T[] toArray() {
        T[] array = (T[])new Object[size];
        Node<T> node = head;
        for (int i = 0; i < size; i++) {
            array[i] = node.item;
            node = node.next;
        }
        return array;
    }

    @Override
    public String toString() {
        String out = "[";
        StringBuilder sb = new StringBuilder(out);
        Node<T> node = head;
        while (node != null) {
            if (node.next == null) {
                sb.append(node.item.toString());
            } else {
                sb.append(node.item.toString()).append(", ");
            }
            node = node.next;
        }
        sb.append("]");
        return sb.toString();
    }
}
