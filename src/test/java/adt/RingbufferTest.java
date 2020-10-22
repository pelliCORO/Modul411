package adt;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RingbufferTest {

    private Ringbuffer<Integer> ringbuffer;

    @BeforeEach
    void setUp() {
        ringbuffer = new Ringbuffer<>();
    }

    @Test
    void isEmpty() {
        assertEquals(true, ringbuffer.isEmpty());
    }

    @Test
    void getFrontElement() {
    }

    @Test
    void getRearElement() {
    }

    @Test
    void put() {
        ringbuffer.put(5);
        assertEquals(5, ringbuffer.getFrontElement());
    }

    @Test
    void remove() {
    }
}