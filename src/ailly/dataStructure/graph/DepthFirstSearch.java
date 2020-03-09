package ailly.dataStructure.graph;

public class DepthFirstSearch {

  private boolean[] marked;
  private int count;

  public DepthFirstSearch(Graph G, int start) {
    marked = new boolean[G.getVertex()];
    dfs(G, start);
  }

  private void dfs(Graph G, int start) {
    marked[start] = true;
    count++;
    for (int v : G.adj(start)) {
      if (marked[v] != true) {
        dfs(G, v);
      }
    }
  }

  public boolean marked(int v) {
    return marked[v];
  }

  public int getCount() {
    return count;
  }
}
