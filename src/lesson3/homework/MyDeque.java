package lesson3.homework;

import java.util.NoSuchElementException;

public class MyDeque<T> {
    private T[] list;
    private int size;
    private int capacity;
    private final int DEFAULT_CAPACITY = 10;
    private int begin;
    private int end;

    public MyDeque(int capacity) throws IllegalArgumentException {
        if (capacity <= 0) {
            throw new IllegalArgumentException("capacity: " + capacity);
        }
        this.capacity = capacity;
        list = (T[]) new Object[capacity];
    }

    public MyDeque() {
        this.capacity = DEFAULT_CAPACITY;
        list = (T[]) new Object[capacity];
    }

    public void updateCapacity() {
        capacity *= 2;
        T[] tmp = (T[]) new Object[capacity];
        for (int i = 0; i < list.length; i++) {
            tmp[i] = list[(i + begin) % list.length];
        }
        begin = 0;
        end = list.length;
        list = tmp;
    }

    public void addLast(T item) throws IllegalStateException {
        if (isFull()) {
            updateCapacity();
        }
        size++;
        list[end] = item;
        end = nextIndex(end);
    }

    public void addFirst(T item) throws IllegalStateException {
        if (isFull()) {
            updateCapacity();
        }
        size++;
        begin = prevIndex(begin);
        list[begin] = item;
    }

    public T peekFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return list[begin];
    }

    public T peekLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return list[prevIndex(end)];
    }

    public T removeFirst() {
        T temp = peekFirst();
        size--;
        list[begin] = null;
        begin = nextIndex(begin);
        return temp;
    }

    public T removeLast() {
        T temp = peekLast();
        size--;
        end = prevIndex(end);
        list[end] = null;
        return temp;
    }


    private int nextIndex(int index) {
        return (index + 1) % list.length;
    }

    private int prevIndex(int index) {
        return (list.length + index - 1) % list.length;
    }

    public boolean isFull() {
        return size == list.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");

        for (int i = 0; i < size; i++) {
            sb.append(list[(i + begin) % list.length]).append(", ");
        }
        if (size > 0) {
            sb.setLength(sb.length() - 2);
        }
        sb.append("]");
        return sb.toString();
    }
}
