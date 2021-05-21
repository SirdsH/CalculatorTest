package cz.educanet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperationsTest {
    Operations op = new Operations();

    @Test
    void getPlus() {
        int result = op.getPlus(2, 2);
        assertEquals(4, result);

        int result1 = op.getPlus(5, 2);
        assertEquals(7, result1);
    }

    @Test
    void getMinus() {
        int result = op.getMinus(10, 10);
        assertEquals(0, result);

        int result1 = op.getMinus(10, 3);
        assertEquals(7, result1);
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

        double result1 = op.getDivide(60, 20);
        assertEquals(3, result1);
    }

    @Test
    void getPow() {
        double result = op.getPow(5, 2);
        assertEquals(25, result);

        double result1 = op.getPow(10, 2);
        assertEquals(100, result1);
    }

    @Test
    void getFactorial() {
        int result = op.getFactorial(5);
        assertEquals(120, result);

        int result1 = op.getFactorial(7);
        assertEquals(5040, result1);
    }
}