package lesson4.homework;

import lesson4.MyLinkedList;

public class MyLinkedQueue<T> {
    MyLinkedList mll = new MyLinkedList();

    public void insert(T item) throws IllegalStateException {
        mll.insertLast(item);
    }

    public T peekFront() {
        return (T) mll.getFirst();
    }

    public T remove() {
        return (T) mll.removeFirst();
    }

    public boolean isEmpty() {
        return mll.isEmpty();
    }

    public int size() {
        return mll.size();
    }


}
