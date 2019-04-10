package dataStructures;

public class BinarySearchTree<T extends Comparable<T>> {
    class Node<T> {
        Node<T> left;
        Node<T> right;
        T value;

        Node(T value) {
            this.value = value;
        }
    }

    private Node<T> root;

    public void insert(T value) {
        if (root == null) {
            root = new Node<>(value);
        } else {
            insert(value, root);
        }
    }

    private void insert(T value, Node<T> node) {
        if (value.compareTo(node.value) < 0) {
            if (node.left == null) {
                node.left = new Node<>(value);
            } else {
                insert(value, node.left);
            }
        } else {
            if (node.right == null) {
                node.right = new Node<T>(value);
            } else {
                insert(value, node.right);
            }
        }
    }

    public T find(T value) {
        return find(value, root);
    }

    private T find(T value, Node<T> node) {
        if (node == null) { return null; }
        if (value.equals(node.value)) {
            return node.value;
        }
        if (value.compareTo(node.value) < 0) {
            return find(value, node.left);
        } else {
            return find (value, node.right);
        }
    }

    // Loop solution
    public T min() {
        Node<T> node = root;
        T value = null;

        while (node != null) {
            value = node.value;
            node = node.left;
        }
        return value;
    }

    // Recursive solution
    public T max() {
        return max(root);
    }

    private T max (Node<T> node) {
        if (node == null) { return null; }
        if (node.right == null) {
            return node.value;
        } else {
            return max(node.right);
        }
    }
}
