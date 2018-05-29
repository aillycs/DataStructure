package ailly.graph;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class TestPath {
    public static void main(String[] args) {
        String file = "resource/G1.dat";

        Scanner scan = null;
        try {
            scan = new Scanner(new File(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Graph G = new Graph(scan);
        int startV = 0;
        int goalV = 4;

        DepthFirstPath depthFirstPath = new DepthFirstPath(G, startV);
        List<Integer> path = depthFirstPath.PathTo(4);
        System.out.println("path from " + startV + " to " + goalV + ": ");
        for (int x : path) {
            System.out.print(x);
            if (x != goalV)
                System.out.print(" -> ");
        }

    }
}
