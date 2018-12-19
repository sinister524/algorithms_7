package ru.geekbrains.algorithms7;

public class Vertex {
    public char label;
    public boolean wasVisited;
    public int parent;

    public Vertex(char label) {
        this.label = label;
        this.wasVisited = false;
        this.parent = -1;
    }
}
