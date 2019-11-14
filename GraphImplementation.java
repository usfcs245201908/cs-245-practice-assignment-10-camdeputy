import java.util.*;

public class GraphImplementation implements Graph {

    private int vertices;
    private int adj[][];

    public GraphImplementation(int vertices) {
        this.vertices = vertices;
        adj = new int[vertices][vertices];
    }

    @Override
    public void addEdge(int v1, int v2) throws Exception {
        if(v1 < 0 || v2 < 0)
            throw new Exception("Cannot be negative");
        else {
            adj[v1][v2] = 1;
        }
    }

    @Override
    public List<Integer> topologicalSort() {
        return null;
    }


    public List<Integer> neighbors(int v) {
        List<Integer> neighbors = new ArrayList<>();
        for(int i = 0; i < adj.length; i++) {
            if(adj[v][i] == 1)
                neighbors.add(i);
        }
        return neighbors;
    }
}
