package binarytree;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class BinaryLinkedTreeTest {

    private BinaryLinkedTree<Integer> tree;

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUp() {
        tree = new BinaryLinkedTree<>();
        tree.makeTree(
                6,
                new Node<>(3,
                        new Node<>(1),
                        new Node<>(5)),
                new Node<>(9,
                        new Node<>(7),
                        new Node<>(10))
        );

        System.setOut(new PrintStream(outContent));
    }

    @BeforeEach
    void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void preOrder() {
        tree.preOrder(BinaryLinkedTree.outputMethod);
        assertEquals("6 3 1 5 9 7 10 ", outContent.toString());
    }

    @Test
    void inOrder() {
        tree.inOrder(BinaryLinkedTree.outputMethod);
        assertEquals("1 3 5 6 7 9 10 ", outContent.toString());
    }

    @Test
    void postOrder() {
        tree.postOrder(BinaryLinkedTree.outputMethod);
        assertEquals("1 5 3 7 10 9 6 ", outContent.toString());
    }

    @Test
    void levelOrder() {
        tree.levelOrder(BinaryLinkedTree.outputMethod);
        assertEquals("6 3 9 1 5 7 10 ", outContent.toString());
    }

    @Test
    void size() {
        assertEquals(7, tree.size());
    }

    @Test
    void height() {
        assertEquals(3, tree.height());
    }

    @Test
    void insertOne() {
        assertTrue(tree.insert(4));
        tree.inOrder(BinaryLinkedTree.outputMethod);
        assertEquals("1 3 4 5 6 7 9 10 ", outContent.toString());
    }

    @Test
    void insertTwo() {
        assertTrue(tree.insert(4));
        assertTrue(tree.insert(8));
        tree.inOrder(BinaryLinkedTree.outputMethod);
        assertEquals("1 3 4 5 6 7 8 9 10 ", outContent.toString());
    }

    @Test
    void insertTwoLevelTest() {
        assertTrue(tree.insert(4));
        assertTrue(tree.insert(8));
        tree.levelOrder(BinaryLinkedTree.outputMethod);
        assertEquals("6 3 9 1 5 7 10 4 8 ", outContent.toString());
    }

    //TODO
    @Test
    void searchTest() {
        //positive Test
        //find methode mit einem element das es gibt
        assertTrue(tree.find(3));

        //find methode mit element das es NICHT gibt
        assertFalse(tree.find(30));

        //serach methode mit element das es  gibt-->NOT NULL
        assertNotNull(tree.search(1));

        //serach methode mit element das es NICHT gibt-->NULL
        assertNull(tree.search(8));


        //negative Tests(Diese Test sollen failen)

        //find methode mit einem element das es gibt-->Falsch weil es das element gibt(find gibt True zurück)
        assertFalse(tree.find(6));

        //find methode mit element das es NICHT gibt -->Falsch weil es das element NICHT gibt(find gibt False zurück)
        assertTrue(tree.find(50));

        //serach methode mit element das es gibt --> Falsch weil NOT Null zurück gegeben wird da es existiert
        assertNull(tree.search(1));

        //serach methode mit element das es NICHT gibt-->Falsch weil Null zurück gegeben wird da es NICHT existiert
        assertNull(tree.search(12));



    }
}






