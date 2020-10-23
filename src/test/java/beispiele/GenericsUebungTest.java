package beispiele;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class GenericsUebungTest {

    @BeforeEach
    void setUp() {

    }


    @Test
    void showValueType() {
    GenericsUebung<Integer, String> item1 = new GenericsUebung(3, "aaaa");
    GenericsUebung<Integer, Integer> item2 = new GenericsUebung(2, 2);
    assertEquals("java.lang.String",item1.showValueType());


    }
}