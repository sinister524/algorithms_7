package ru.geekbrains.algorithms7;

public class Main {

    public static void main(String[] args) {
        Graph gr = new Graph();
        gr.addVertex('A'); // 0
        gr.addVertex('B'); // 1
        gr.addVertex('C'); // 2
        gr.addVertex('D'); // 3
        gr.addVertex('E'); // 4
        gr.addVertex('F'); // 5
        gr.addVertex('G'); // 6
        gr.addVertex('X'); // 7
        gr.addVertex('Y'); // 8
        gr.addVertex('Z'); // 9

        gr.addEdge(0, 4); // A-E
        gr.addEdge(0, 1); // A-B
        gr.addEdge(1, 2); // B-C
        gr.addEdge(1, 8); // B-Y
        gr.addEdge(2, 3); // C-D
        gr.addEdge(2, 7); // C-X
        gr.addEdge(3, 9); // D-Z
        gr.addEdge(9, 5); // Z-F
        gr.addEdge(5, 6); // F-G
        gr.addEdge(0, 6); // A-G
        gr.addEdge(8, 9); // Y-Z
        gr.addEdge(7, 9); // X-Z
        gr.addEdge(4, 9); // E-Z


        gr.dfs();
        System.out.println();
        gr.bfs();
    }
}
