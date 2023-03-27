package homework18;

import static com.hillel.kornieiev.project.homework18.Main.arrayBox;
import static com.hillel.kornieiev.project.homework18.Main.arrayMath;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    void testMethodAver1() {
        int[] arrayTest = {1,2,3,4,5};
        assertEquals(2.0, arrayMath(arrayTest), arrayTest.length);

    }

    @Test
    void testMethodAver2() {
        int[] arrayTest = {0};
        assertEquals(0, arrayMath(arrayTest));
    }

    @Test
    void testMethodAver3() {
        int[] arrayTest = null;
        assertEquals(-1, arrayMath(arrayTest));
    }

    //Box.Box.Box.Box.Box.Box.Box.Box.

    @Test
    void testMethodBox1() {
        int[][] arrayTest = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        assertEquals(1, arrayBox(arrayTest));
    }

    @Test
    void testMethodBox2() {
        int[][] arrayTest = {{1}};
        assertEquals(1, arrayBox(arrayTest));
    }

    @Test
    void testMethodBox3() {
        int[][] arrayTest = {
                {1,2},
                {3,4},
                {5,6}
        };
        assertEquals(0, arrayBox(arrayTest));
    }

    @Test
    void testMethodBox4() {
        int[][] arrayTest = { };
        assertEquals(-1, arrayBox(arrayTest));
    }

    @Test
    void testMethodBox5() {
        int[][] arrayTest = null;

        assertEquals(-2, arrayBox(arrayTest));
    }
}
