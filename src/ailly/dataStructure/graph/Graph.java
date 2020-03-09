package ailly.dataStructure.graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Graph {

  private int V;
  private int E;
  private List<Integer>[] adj;

  public Graph(int V) {
    this.V = V;
    adj = (List<Integer>[]) new ArrayList[V];
    for (int i = 0; i < V; i++) {
      adj[i] = new ArrayList<>();
    }
  }

  public Graph(Scanner scanner) {
    this(scanner.nextInt());
    int E = scanner.nextInt();
    for (int i = 0; i < E; i++) {
      int v1 = scanner.nextInt();
      int v2 = scanner.nextInt();
      addEdge(v1, v2);
    }
  }

  public int getVertex() {
    return V;
  }

  public int getEdge() {
    return E;
  }

  public void addEdge(int v1, int v2) {
    adj[v1].add(v2);
    adj[v2].add(v1);
    E++;
  }

  public Iterable<Integer> adj(int V) {
    return adj[V];
  }

  //    public String toString() {
  //
  //    }


}
