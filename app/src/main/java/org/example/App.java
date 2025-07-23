package org.example;


public class App {

    public void runBinaryTreeTest() {
        // Creating Squirrel objects
        Squirrel cheeks = new Squirrel("Cheeks");
        Squirrel squeaks = new Squirrel("Squeaks");
        Squirrel fluffyButt = new Squirrel("Mr. Fluffy Butt");

        // Creating Nodes from the Squirrel objects
        Node nodeOne = new Node(cheeks);
        Node nodeTwo = new Node(squeaks);
        Node nodeThree = new Node(fluffyButt);

        // Connecting the nodes 
        nodeOne.setLeft(nodeTwo); 
        nodeOne.setRight(nodeThree); 

        Node retrievedLeft = nodeOne.left();
        Node retrievedRight = nodeOne.right();

        System.out.println("Left child: " + retrievedLeft.getSquirrel().getName()); // "Squeaks"
        System.out.println("Right child: " + retrievedRight.getSquirrel().getName()); // "Mr. Fluffy Butt"
    }

    public static void main(String[] args) {
        App app = new App();
        System.out.println("Welcome to my A Mighty Oak Tree Program!");
        app.runBinaryTreeTest();

    }
}

