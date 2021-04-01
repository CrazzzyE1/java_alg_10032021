package Lesson7;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {


//        1. Реализовать программу, в которой задается граф из 10 вершин.
//        Задать ребра и найти кратчайший путь с помощью поиска в ширину.
//        2*. Вынести в родительский класс общую часть классов поиска в глубину и ширину.

   //Task 1
        Graph graph = new Graph(10);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(0, 3);
        graph.addEdge(0, 5);
        graph.addEdge(0, 8);
        graph.addEdge(3, 4);
        graph.addEdge(2, 6);
        graph.addEdge(5, 9);
        graph.addEdge(6, 8);
        graph.addEdge(1, 7);
        graph.addEdge(7, 8);
        BreadthFirstPath bf = new BreadthFirstPath(graph, 0);
        System.out.println(bf.hasPathTo(6));
        System.out.println(bf.pathTo(6));
        System.out.println(bf.hasPathTo(9));
        System.out.println(bf.pathTo(9));
        bf = new BreadthFirstPath(graph, 7);
        System.out.println(bf.hasPathTo(9));
        System.out.println(bf.pathTo(9));

//        Graph graph = new Graph(10);
//        graph.addEdge(1,2);
//        graph.addEdge(0,4);
//        graph.addEdge(1,4);
//        graph.addEdge(3,4);
//        graph.addEdge(7,8);
//
//        graph.addEdge(0,1);

//        System.out.println(graph.getAdjList(4));

//        DepthFirstPath dfp = new DepthFirstPath(graph, 0);
//        System.out.println(dfp.hasPathTo(2));
//        System.out.println(dfp.pathTo(2));
//
//        BreadthFirstPath bfp  = new BreadthFirstPath(graph, 0);
//        System.out.println(bfp.hasPathTo(2));
//        System.out.println(bfp.pathTo(2));


    }
}
