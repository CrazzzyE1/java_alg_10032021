package lesson4;

import lesson4.homework.MyLinkedQueue;
import lesson4.homework.MyLinkedStack;

import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

//       + 1. Реализовать классы стек и очередь на базе линкед листа.
//      +- 2*. Реализовать методы лист итератора.
//       + 3. В методе main проверить работу итератора и лист итератора

        MyLinkedStack mls = new MyLinkedStack();
        String str = "Hello world";
        for (int i = 0; i < str.length(); i++) {
            mls.push(str.charAt(i));
        }

        int size = mls.size();
        for (int i = 0; i < size; i++) {
            System.out.print(mls.pop());
        }
        System.out.println();
        System.out.println("**************");

        MyLinkedQueue mlq = new MyLinkedQueue();
        String str2 = "Hello world";
        for (int i = 0; i < str2.length(); i++) {
            mlq.insert(str2.charAt(i));
        }

        size = mlq.size();
        for (int i = 0; i < size; i++) {
            System.out.print(mlq.remove());
        }


        System.out.println();
        System.out.println("__________________________");

        MyLinkedList<String> mll = new MyLinkedList<>();
        mll.insertFirst("one");
        mll.insertFirst("two");
        mll.insertFirst("three");

//        System.out.println(mll.removeFirst());
//
//        System.out.println(mll.removeLast());
//        System.out.println(mll.removeLast());
//        System.out.println(mll);
//        mll.insertLast("four");
//        System.out.println(mll);

//        mll.insert(1, "four");
//        System.out.println(mll);
////
//        mll.remove("one");
//        System.out.println(mll);


        //Iterator
        for (String s : mll) {
            System.out.println(s);
        }

        System.out.println("_______________");

        //ListIterator
        ListIterator<String> li = mll.listiterator();
        while(li.hasNext()){
            System.out.println(li.next());
            System.out.println(li.nextIndex());
            System.out.println(li.previousIndex());
        }

        System.out.println("_______________");

        while(li.hasPrevious()){
            System.out.println(li.previous());
            System.out.println(li.nextIndex());
            System.out.println(li.previousIndex());
        }


        }

    }
