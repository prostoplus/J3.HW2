package HW6;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import HW6.Arr2;

public class Arr2Test {

    private static Arr2 arr;

    @BeforeClass
    public static void init() {
        System.out.println("Progress");
        arr = new Arr2();

    }

    @Test
    public void testArrayMass1() {
        Assert.assertTrue(Arr2.arrayMass2(new int[]{1, 4}));
    }

    @Test
    public void testArrayMass2() {
        Assert.assertTrue(Arr2.arrayMass2(new int[]{1, 1}));
    }

    @Test
    public void testArrayMass3() {
        Assert.assertTrue(Arr2.arrayMass2(new int[]{4, 4}));
    }

    @Test
    public void testArrayMass4() {
        Assert.assertTrue(Arr2.arrayMass2(new int[]{2, 3}));
    }

}