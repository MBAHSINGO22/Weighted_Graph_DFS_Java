package PERTEMUAN9;

public class GraphMain {
    public static void main(String[] args) {

        Graph graph = new Graph();

        graph.addVertex('A');
        graph.addVertex('B');
        graph.addVertex('C');
        graph.addVertex('D');
        graph.addVertex('E');
        graph.addVertex('F');
        graph.addVertex('G');
        graph.addVertex('H');
        graph.addVertex('I');

        System.out.println("Daftar Vertex: ");
        for (int i = 0; i < graph.getCountVertex(); i++) {
            graph.displayVertex(i);
        }

        graph.addEdge('A', 'I', 1);
        graph.addEdge('A', 'F', 1);
        graph.addEdge('A', 'B', 1);
        graph.addEdge('B', 'E', 1);
        graph.addEdge('B', 'C', 1);
        graph.addEdge('C', 'D', 1);
        graph.addEdge('C', 'E', 1);
        graph.addEdge('D', 'H', 1);
        graph.addEdge('D', 'G', 1);
        graph.addEdge('G', 'E', 1);
        graph.addEdge('G', 'F', 1);

        System.out.println("\n\nDFS: ");
        graph.dfs();

        System.out.println("\n\n" + graph.toString());

        Graph graph2 = new Graph();

        graph2.addVertex('A');
        graph2.addVertex('B');
        graph2.addVertex('C');
        graph2.addVertex('D');
        graph2.addVertex('E');

        System.out.println("Daftar Vertex: ");
        for (int i = 0; i < graph2.getCountVertex(); i++) {
            graph.displayVertex(i);
        }

        graph2.addEdge('A', 'B', 1);
        graph2.addEdge('B', 'C', 1);
        graph2.addEdge('C', 'D', 1);
        graph2.addEdge('D', 'E', 1);
        graph2.addEdge('E', 'A', 1); 

        System.out.println("\n\nDFS: ");
        graph2.dfs();

        System.out.println("\n\n" + graph2.toString());
    }
    }
    
