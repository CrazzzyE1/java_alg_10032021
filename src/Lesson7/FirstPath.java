package Lesson7;

import java.util.LinkedList;

public abstract class FirstPath {
    protected boolean[] marked;
    protected int[] edgeTo;
    protected int source;

    protected FirstPath(Graph g, int source) {
        this.source = source;
        marked = new boolean[g.getVertexCount()];
        edgeTo = new int[g.getVertexCount()];
    }

    protected boolean hasPathTo(int w) {
        return marked[w];
    }

    protected LinkedList<Integer> pathTo(int w) {
        if (!hasPathTo(w)) {
            return null;
        }
        LinkedList<Integer> stack = new LinkedList<>();
        int vertex = w;
        while (vertex != source) {
            stack.push(vertex);
            vertex = edgeTo[vertex];
        }
        return stack;
    }
}
