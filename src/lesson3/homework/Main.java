package lesson3.homework;

//    + 1. Создать программу, которая переворачивает вводимые строки (читает справа налево).
//    + 2. Создать класс для реализации дека.
//    + 3*. Сделать возможность расширения внутреннего массива у стека и очереди.

import lesson3.MyQueue;
import lesson3.MyStack;

public class Main {
    public static void main(String[] args) {
//        System.out.println(new FlipString().flip("Hello world"));
//        System.out.println(new FlipString().flip("Привет приятель"));

//        MyStack<Integer> ms = new MyStack<>(2);
//        ms.push(2);

//        MyQueue mq = new MyQueue(5);
//        mq.insert(1);
//        mq.insert(2);
//        mq.insert(3);
//        mq.remove();
//        mq.remove();
//        mq.remove();
//        mq.insert(4);
//        mq.insert(5);
//        mq.insert(6);
//        mq.insert(7);
//        mq.insert(8);
//        mq.insert(9);
//        mq.remove();
//        mq.remove();
//        mq.insert(10);
//        mq.insert(11);
//        mq.insert(12);
//        mq.insert(13);
//        mq.insert(14);
//        mq.insert(15);

        MyDeque <Integer> dq = new MyDeque<>();
        dq.addLast(5);
        dq.addLast(6);
        dq.addLast(7);
        System.out.println(dq);
        dq.addFirst(4);
        dq.addFirst(3);
        System.out.println(dq);
        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());
        System.out.println(dq.removeFirst());
        System.out.println(dq.removeLast());

        System.out.println(dq);
    }
}
