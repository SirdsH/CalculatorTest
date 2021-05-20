package cz.educanet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperationsTest {
    Operations op = new Operations();

    @Test
    void getPlus() {
        int result = op.getPlus(2, 2);
        assertEquals(4, result);
    }

    @Test
    void getMinus() {
        int result = op.getMinus(10, 10);
        assertEquals(0, result);
    }

    @Test
    void getMultiply() {
        int result = op.getMultiply(5, 5);
        assertEquals(25, result);
    }

    @Test
    void getDivide() {
        double result = op.getDivide(50, 5);
        assertEquals(10, result);
    }

    @Test
    void getPow() {
        double result = op.getPow(5, 2);
        assertEquals(25, result);
    }

    @Test
    void getFactorial() {
        int result = op.getFactorial(5);
        assertEquals(120, result);
    }
}