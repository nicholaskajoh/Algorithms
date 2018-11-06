import java.util.*;

class Graph {
    private int v; // number of vertices
    private LinkedList<Integer>[] al; // array of adjacency lists

    Graph(int v) {
        this.v = v;
        this.al = new LinkedList[v];
        for (int i = 0; i < v; i++) this.al[i] = new LinkedList<Integer>();
    }

    void addEdge(int v1, int v2) {
        this.al[v1].add(v2);
    }

    void dfs(int start) {
        LinkedList<Integer> stack = new LinkedList<Integer>();
        boolean[] visited = new boolean[this.v]; // initially false

        // set initial node as visited and push it to the stack
        visited[start] = true;
        stack.add(start);

        while (stack.size() != 0) {
            int current_v = stack.removeLast(); // pop current vertex
            System.out.print(current_v + " ");

            // push adjacent vertices to the stack
            Iterator<Integer> iter = this.al[current_v].iterator();
            while (iter.hasNext()) {
                int n = iter.next(); 
                if (!visited[n]) {
                    visited[n] = true;
                    stack.add(n);
                }
            }
        }
    }
}

class DepthFirstSearch {
    public static void main(String[] args) {
        Graph myG = new Graph(6);
        myG.addEdge(0, 1);
        myG.addEdge(0, 2);
        myG.addEdge(1, 3);
        myG.addEdge(1, 4);
        myG.addEdge(4, 5);

        System.out.println("Depth First Traversal");
        myG.dfs(0);
    }
}