package dataStructures;

import java.util.EmptyStackException;

public class Stack<T> {
    int size;
    int top = -1;
    T[] items;

    Stack(int size) {
        this.size = size;
        this.items = (T[]) new Object[size];
    }

    public void add(T item) throws IndexOutOfBoundsException {
        if (top == size - 1) {
            throw new IndexOutOfBoundsException("Stack is full");
        } else {
            items[++top] = item;
        }
    }

    public T pop() throws EmptyStackException {
        if (top < 0) {
            throw new EmptyStackException();
        }

        T item = items[top];
        items[top] = null;
        top--;
        return item;
    }

    public T peek() throws EmptyStackException {
        if (top < 0) {
            throw new EmptyStackException();
        }

        return items[top];
    }
}
