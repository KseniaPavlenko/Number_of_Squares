package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    public void shouldCountNumberOfSquaresInTheRangeFrom200To300() {
        SQRService service = new SQRService();

        int lowerBound = 200;
        int upperBound = 300;
        int expected = 3;

        int actual = service.countNumberOfSquares(lowerBound, upperBound);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCountNumberOfSquaresInTheRangeFrom100To10_000() {
        SQRService service = new SQRService();

        int lowerBound = 100;
        int upperBound = 10_000;
        int expected = 90;

        int actual = service.countNumberOfSquares(lowerBound, upperBound);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCountNumberOfSquaresInTheRangeFrom20To40() {
        SQRService service = new SQRService();

        int lowerBound = 20;
        int upperBound = 40;
        int expected = 0;

        int actual = service.countNumberOfSquares(lowerBound, upperBound);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCountNumberOfSquaresInTheRangeFrom200To400() {
        SQRService service = new SQRService();

        int lowerBound = 200;
        int upperBound = 400;
        int expected = 6;

        int actual = service.countNumberOfSquares(lowerBound, upperBound);

        assertEquals(expected, actual);
    }
}