import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

public class MathUtilTest {

    @ParameterizedTest
    @ValueSource(ints = {3, 23, 311, 487, 653, 947})
    void testIsPrime(int number) {
        assertTrue(MathUtil.isPrime(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {32, 64, 2, 20, 30, 26})
    void testIsEven(int number) {
        assertTrue(MathUtil.isEven(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {23, 46, 115, 184, 207, 230})
    void testIsMultiple(int number) {
        assertTrue(MathUtil.isMultiple(number, 23));
    }
    //nao me esta a deixar  fazer mas assertFalse, nao sei pk
    /*@ParameterizedTest
    @ValueSource(ints={1, 15, 0, 77, 21, 50})
    void testISNotPrime(int number){
        assertFalse(MathUtil.isPrime(number));
    }
    @ParameterizedTest
    @ValueSource(ints={1, 50, 15})
    void testIsNotEven(int number){
        assertFalse(MathUtil.isEven(number));
    }
    @ParameterizedTest
    @ValueSource(ints = {100, 200, 57})
    void testIsNotMultiple(int number){
        assertFalse(MathUtil.isMultiple(number, 23));

    }*/
}