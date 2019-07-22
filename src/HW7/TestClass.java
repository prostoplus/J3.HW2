package HW7;

public class TestClass {

    @BeforeSuite
    public static void runBeforeSuite() {
        System.out.println("runBeforeSuite");
    }

    @Test(priority = 4)
    public static void runTest4() {
        System.out.println("runTest4");
    }

    @Test(priority = 8)
    public static void runTest8() {
        System.out.println("runTest8");
    }

    @Test(priority = 9)
    public static void runTest9() {
        System.out.println("runTest9");
    }

    @Test
    public static void runTestNoPriority1() {
        System.out.println("runTest with no priority 1");
    }

    @Test
    public static void runTestNoPriority2() {
        System.out.println("runTest with no priority 2");
    }

    @Test(priority = 2)
    public static void runTest2() {
        System.out.println("runTest2");
    }

    @Test
    public static void runTest5() {
        System.out.println("runTest5 default");
    }

    @Test(priority = 3)
    public static void runTest3() {
        System.out.println("runTest3");
    }

    @AfterSuite
    public static void runAfterSuite() {
        System.out.println("runAfterSuite");
    }
}