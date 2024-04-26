import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class PrimeFactorsTest {

    PrimeFactor primeFactor;

    @BeforeEach
    void setUp() {
        primeFactor = new PrimeFactor();
    }

    @Test
    public void test(){
        assertEquals(10, 10);
    }

    @Test
    public void testPrimeFactorOf1(){
        assertEquals(Arrays.asList(), primeFactor.of(1));
    }

    @Test
    public void testPrimeFactorOf2(){
        assertEquals(Arrays.asList(2), primeFactor.of(2));
    }
}
