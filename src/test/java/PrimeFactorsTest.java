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

    @Test
    public void testPrimeFactorOf3(){
        assertEquals(Arrays.asList(3), primeFactor.of(3));
    }

    @Test
    public void testPrimeFactorOf4(){
        assertEquals(Arrays.asList(2,2), primeFactor.of(4));
    }

    @Test
    public void testPrimeFactorOf5(){
        assertEquals(Arrays.asList(5), primeFactor.of(5));
    }

    @Test
    public void testPrimeFactorOf6(){
        assertEquals(Arrays.asList(2, 3), primeFactor.of(6));
    }

    @Test
    public void testPrimeFactorOf7(){
        assertEquals(Arrays.asList(7), primeFactor.of(7));
    }

    @Test
    public void testPrimeFactorOf8(){
        assertEquals(Arrays.asList(2, 2, 2), primeFactor.of(8));
    }

    @Test
    public void testPrimeFactorOf9(){
        assertEquals(Arrays.asList(3, 3), primeFactor.of(9));
    }

    @Test
    public void testPrimeFactorOf10(){
        assertEquals(Arrays.asList(2, 5), primeFactor.of(10));
    }
}
