package ailly.graph;

import java.util.ArrayList;
import java.util.List;

public class DepthFirstPath {
    private boolean[] marked;
    private int[] edgeTo;
    private int start;

    public DepthFirstPath(Graph G, int start) {
        marked = new boolean[G.getVertex()];
        edgeTo = new int[G.getVertex()];
        this.start = start;
        dfs(G, start);
    }

    private void dfs(Graph G, int start) {
        marked[start] = true;
        for (int v : G.adj(start)) {
            if (!marked[v]) {
                edgeTo[v] = start;
                dfs(G, v);
            }
        }
    }

    public boolean hasPathTo(int v) {
        return marked[v];
    }

    public List<Integer> PathTo(int v) {
        if (!hasPathTo(v))
            return null;
        List<Integer> path = new ArrayList<>();
        for (int x = v; x != start; x = edgeTo[x]) {
            path.add(0, x);

        }
        path.add(0, start);
        return path;
    }
}
