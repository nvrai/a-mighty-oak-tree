package org.example;

public class Node {
    private Squirrel squirrel;
    private Node left;
    private Node right;

    // Initialize the node with a squirrel
    public Node(Squirrel squirrel) {
        this.squirrel = squirrel;
        this.left = null;
        this.right = null;
    }
    
    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node left() {
        return this.left;
    }

    public Node right() {
        return this.right;
    }

    public Squirrel getSquirrel() {
        return this.squirrel;
    }
}
