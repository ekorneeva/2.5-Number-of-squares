package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    public void shouldSqrNumber() {
        SQRService service = new SQRService();


        int min = 200;
        int max = 300;
        int expected = 3;


        int actual = service.sqrNumber(min, max);


        assertEquals(expected, actual);
    }
    
        @Test
    void shouldSqrNumber() {
        SQRService service = new SQRService();

        int bottom = 2025;
        int upper = 2500;
        int expected = 6;

        int actual = service.findNumber(bottom, upper);

        assertEquals(expected, actual);
    }

    @Test
    void shouldSqrNumber() {
        SQRService service = new SQRService();

        int bottom = 100;
        int upper = 200;
        int expected = 5;

        int actual = service.findNumber(bottom, upper);

        assertEquals(expected, actual);
    }

    @Test
    void shouldSqrNumber() {
        SQRService service = new SQRService();

        int bottom = 9604;
        int upper = 9801;
        int expected = 2;

        int actual = service.findNumbers(bottom, upper);

        assertEquals(expected, actual);
    }
}
