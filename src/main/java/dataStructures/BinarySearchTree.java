package dataStructures;

public class BinarySearchTree<T extends Comparable<T>> {
    private BinarySearchTree<T> left;
    private BinarySearchTree<T> right;
    private T value;

    BinarySearchTree() {}

    BinarySearchTree(T value) {
        this.value = value;
    }

    public void insert(T value) {
        if (this.value == null) {
            this.value = value;
        } else {
            if (value.compareTo(this.value) < 0) {
                if (left == null) {
                    left = new BinarySearchTree<>(value);
                } else {
                    left.insert(value);
                }
            } else {
                if (right == null) {
                    right = new BinarySearchTree<>(value);
                } else {
                    right.insert(value);
                }
            }
        }
    }

    public T find(T value) {
        if (this.value.equals(value)) {
            return value;
        }
        if (left != null && value.compareTo(this.value) < 0) {
            return left.find(value);
        } else if (right != null && value.compareTo(this.value) > 0) {
            return right.find(value);
        } else {
            return null;
        }
    }

    public T min() {
        if (left == null) {
            return value;
        } else {
            return left.min();
        }
    }

    public T max() {
        if (right == null) {
            return value;
        } else {
            return right.min();
        }
    }
}
