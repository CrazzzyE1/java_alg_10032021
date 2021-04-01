package lesson6;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        MyTreeMap<Integer, String> map = new MyTreeMap<>();
        Random rnd = new Random();
        int quantityTrees = 2_000_000;
        int maxHeight = 6;
        double balancedCount = 0;
        double unBalancedCount = 0;

//        1. Создать и запустить программу для построения двоичного дерева.
//        В цикле построить двадцать деревьев с глубиной в 6 уровней.
//        Данные, которыми необходимо заполнить узлы деревьев, представляются в виде чисел типа int.
//        Число, которое попадает в узел, должно генерироваться случайным образом в диапазоне от -100 до 100.
//
//        2. Проанализировать, какой процент созданных деревьев являются несбалансированными.

        for (int i = 0; i < quantityTrees; i++) {
            int count = 0;
            int tmpN;
            MyTreeMap<Integer, String> tmp = new MyTreeMap();
            while (count < maxHeight) {
                tmpN = rnd.nextInt(201) - 100;
                tmp.put(tmpN, "value " + i);
                count = tmp.height();
            }
//            System.out.println("Height" + tmp.height());
//            System.out.println(tmp);
            if (tmp.isBalanced()) {
//                System.out.println("Balanced");
                balancedCount++;
            } else {
//                System.out.println("Not Balanced");
                unBalancedCount++;
            }
        }

        System.out.println("Balanced percent: " + (balancedCount * 100 / unBalancedCount) + " %");

//
//        map.put(2, "two");
//        map.put(1, "one");
//        map.put(5, "five");
//        map.put(4, "four");
//        map.put(3, "three");
//        map.deleteMin();
//        map.delele(4);
//        map.delele(3);
//        map.delele(5);
//        map.delele(2);
//        System.out.println(map.height());
//
//        System.out.println(map.minKey());
//        System.out.println(map.maxKey());
//
//        System.out.println(map.get(3));
//        map.put(3, "tttrrreee");
//        System.out.println(map.get(3));
//
//        map.deleteMin();
//
//        map.delele(4);
//        System.out.println(map.get(4));
//
//        System.out.println(map);


    }
}
