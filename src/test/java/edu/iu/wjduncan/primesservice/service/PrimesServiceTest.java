package edu.iu.wjduncan.primesservice.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimesServiceTest {
    PrimesService primesService = new PrimesService();
    @Test
    void isPrime() {
        long n = 45;
        assertEquals(false, primesService.isPrime(n));
        long m = 285191;
        assertEquals(true, primesService.isPrime(m));
        long l = 53040293;
        assertEquals(false, primesService.isPrime(l));
    }
}