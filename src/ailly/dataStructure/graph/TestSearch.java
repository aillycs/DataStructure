package ailly.dataStructure.graph;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestSearch {

  public static void main(String[] args) {
    String file = "resource/G1.dat";

    Scanner scan = null;
    try {
      scan = new Scanner(new File(file));
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }

    Graph G = new Graph(scan);
    int startVertex = 0;
    DepthFirstSearch dfs = new DepthFirstSearch(G, startVertex);
    for (int i = 0; i < G.getVertex(); i++) {
      if (dfs.marked(i)) {
        System.out.println(i + " ");
      }
    }
    System.out.println();
    if (G.getVertex() != dfs.getCount()) {
      System.out.println("Not Connected");
    } else {
      System.out.println("Connected");
    }
  }
}
