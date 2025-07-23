package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void squirrelHasCorrectName() {
        Squirrel squirrel = new Squirrel("Cheeks");

        assertEquals("Cheeks", squirrel.getName(), "Squirrel's name should be 'Cheeks'");
    }

    @Test
    void nodeCanSetAndGetLeftAndRightChildren() {
        Squirrel squirrel1 = new Squirrel("Cheeks");
        Squirrel squirrel2 = new Squirrel("Squeaks");
        Squirrel squirrel3 = new Squirrel("Mr. Fluffy Butt");

        Node node1 = new Node(squirrel1);
        Node node2 = new Node(squirrel2);
        Node node3 = new Node(squirrel3);

        node1.setLeft(node2);
        node1.setRight(node3);

        Node leftChild = node1.left();
        assertNotNull(leftChild, "Node should have a left child");
        assertEquals("Squeaks", leftChild.getSquirrel().getName(), "Left child's name should be 'Squeaks'");
        Node rightChild = node1.right();
        assertNotNull(rightChild, "Node should have a right child");
        assertEquals("Mr. Fluffy Butt", rightChild.getSquirrel().getName(), "Right child's name should be 'Mr. Fluffy Butt'");
    }
}
