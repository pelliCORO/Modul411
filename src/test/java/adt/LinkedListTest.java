package adt;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    private LinkedList<String> linkedList;

    @BeforeEach
    void setUp() {
        linkedList = new LinkedList<>();
        linkedList.addLast("1");
        linkedList.addLast("2");
        linkedList.addLast("3");
    }

    @Test
    void isEmpty() {
        assertTrue(linkedList.isEmpty());
    }

    @Test
    void addLast() {
    linkedList.addLast("4");
    System.out.println(linkedList.getFirst());
    System.out.println(linkedList.getFirst().getPayload());
    assertEquals(4,linkedList.getSize());
    }

    @Test
    void getFirst() {
        assertEquals("1",linkedList.getFirst().getPayload());
    }

    @Test
    void getLast() {
        assertEquals("3",linkedList.getLast().getPayload());
    }

    @Test
    void getSize() {
        assertEquals(3,linkedList.getSize());
    }
}
