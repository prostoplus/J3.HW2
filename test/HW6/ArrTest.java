package HW6;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import HW6.Arr;

public class ArrTest {
    private static Arr arr;

    @BeforeClass
    public static void init() {
        System.out.println("Progress");
        arr = new Arr();

    }

    @Test
    public void testArrayMass1() {
        Assert.assertArrayEquals(new int[]{1, 2, 3, 7, 1, 9}, Arr.arrayMass(new int[]{4, 1, 2, 3, 7, 1, 9}));
    }

    @Test
    public void testArrayMass2() {
        Assert.assertArrayEquals(new int[]{9}, Arr.arrayMass(new int[]{4, 1, 2, 3, 7, 4, 9}));
    }

    @Test
    public void testArrayMass3() {
        Assert.assertArrayEquals(new int[]{1, 2}, Arr.arrayMass(new int[]{4, 1, 2, 3, 7, 1, 9}));
    }

    @Test
    public void testArrayMass4() {
        Assert.assertArrayEquals(new int[]{1, 2, 3, 7, 1, 9}, Arr.arrayMass(new int[]{1, 1, 2, 3, 7, 1, 9}));
    }
}