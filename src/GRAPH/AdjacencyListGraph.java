package GRAPH;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class AdjacencyListGraph<T> {

    public class Vertex {

        T value;
        LinkedList<Vertex> neighbours;

        public Vertex(T value) {
            this.value = value;
            this.neighbours = new LinkedList<>();
        }
    }

    private LinkedList<Vertex> vertices;

    public AdjacencyListGraph() {
        this.vertices = new LinkedList<>();
    }


    public void addVertex(T value){

        vertices.add(new Vertex(value));
    }

    public void addEdge(T first, T second){

        Vertex f = get(first);
        Vertex s = get(second);

        if(f!=null && s!=null){
            f.neighbours.add(s);
            s.neighbours.add(f);
        }
    }

    public Vertex get(T value){

        for (Vertex vertex: vertices) {

            if(vertex.value.equals(value)){
                return vertex;
            }
        }

        return null;
    }

    public void display(){

        for (Vertex vertex: vertices) {

            System.out.print( vertex.value + " => ");

            for (Vertex padosi: vertex.neighbours) {

                System.out.print(padosi.value + " ");
            }
            System.out.println();
        }
    }

    public void BFT(){

        Queue<Vertex> queue = new LinkedList<>();

        Set<Vertex> visited = new HashSet<>();

        Vertex vertex = vertices.get(0);

        visited.add(vertex);
        queue.add(vertex);

        while(!queue.isEmpty()){

            Vertex temp = queue.remove();
            System.out.println(temp.value);

            for (Vertex padosi: temp.neighbours) {

                if(!visited.contains(padosi)){
                    queue.add(padosi);
                    visited.add(padosi);
                }
            }
        }
    }


}
