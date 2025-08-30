package PERTEMUAN9;

import java.util.Stack;

public class Graph {
    private int maxVertex = 10;
    private Vertex[] vertexList;
    private int[][] adjacencyMatrix;
    private int countVertex = 0;

    public Graph() {
        vertexList = new Vertex[maxVertex];
        adjacencyMatrix = new int[maxVertex][maxVertex];
        countVertex = 0;
        for (int i = 0; i < vertexList.length; i++) {
            for (int j = 0; j < vertexList.length; j++) {
                if (i == j) {
                    adjacencyMatrix[i][j] = 0;
                } else {
                    adjacencyMatrix[i][j] = -1;
                }
            }
        }
    }

    public int getCountVertex() {
        return countVertex;
    }

    public void displayVertex(int x) {
        System.out.print(vertexList[x].getLabel() + " ");
    }

    public void addVertex(char label) {
        vertexList[countVertex] = new Vertex(label);
        countVertex++;
    }

    public void addEdge(int source, int destination, int weight) {
        adjacencyMatrix[source][destination] = weight;
        adjacencyMatrix[destination][source] = weight;
    }

    public void addEdge(char source, char destination, int weight) {
        addEdge(indexVertex(source), indexVertex(destination), weight);
    }

    public int indexVertex(char label) {
        for (int i = 0; i < countVertex; i++) {
            if (vertexList[i] != null) {
                if (vertexList[i].getLabel() == label) {
                    return i;
                }
            }
        }
        return -1;
    }

    public void print() {
        System.out.println("Graph:");
        for (int i = 0; i < countVertex; i++) {
            System.out.print("\t" + vertexList[i].getLabel());
        }
        System.out.println();
        for (int i = 0; i < countVertex; i++) {
            System.out.print(vertexList[i].getLabel() + "\t");
            for (int j = 0; j < countVertex; j++) {
                System.out.print(adjacencyMatrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public void dfs() {
        dfs(0);
    }

    public void dfs(int seed) {
        Stack<Integer> stack = new Stack<>();
        stack.push(seed);

        while (!stack.isEmpty()) {
            int x = stack.pop();
            Vertex vertex = vertexList[x];

            if (!vertex.flagVisited) {
                System.out.print(vertex.label + " ");
                vertex.flagVisited = true;

                for (int i = countVertex - 1; i >= 0; i--) {
                    if (adjacencyMatrix[x][i] != -1 && !vertexList[i].flagVisited) {
                        stack.push(i);
                    }
                }
            }
        }
    }

    @Override
    public String toString() {
        String result = "Graph:\n";

        for (int i = 0; i < countVertex; i++) {
            result += "\t" + vertexList[i].getLabel();
        }
        result += "\n";

        for (int i = 0; i < countVertex; i++) {
            result += vertexList[i].getLabel() + "\t";
            for (int j = 0; j < countVertex; j++) {
                result += adjacencyMatrix[i][j] + "\t";
            }
            result += "\n";
        }

        return result;
    }
}