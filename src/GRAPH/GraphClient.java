package GRAPH;

public class GraphClient {
    public static void main(String[] args) {

        AdjacencyListGraph<String> graph =new AdjacencyListGraph<>();

        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");

        graph.addEdge("A","B");
        graph.addEdge("A","C");
        graph.addEdge("C","D");

        graph.display();

        graph.BFT();
    }
}
