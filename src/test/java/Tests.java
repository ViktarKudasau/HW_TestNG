import org.example.Main;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

public class Tests {
    @BeforeSuite
    void beforeSuite (){
        System.out.println("Before suite");
    }

    @BeforeClass
    void beforeClass(){
        System.out.println("before class First test");
    }

    @BeforeTest
    void beforeTest(){
        System.out.println("before Test");
    }

    @BeforeMethod
    void beforeMethod() {
        System.out.println("before method");
    }

    @Test(groups = "division", description = "Division by Zero", expectedExceptions = NoSuchMethodException.class)
    void test_1() throws NoSuchMethodException {
        System.out.println("test 1 'Division by Zero' started");
        Main.division(25,0);
    }

    @DataProvider(name = "Test_Division")
    public static Object[][] primeNumbers() {
        return new Object[][] {
                {-2, 2, -1},
                {22, -2, -11},
                {15, 3, 5},
                {0, 3, 0},
                {0, -0.0003, -0.0},
                {-1000000, -2000000, 0.5},
                {1, 0.005, 200},
                {-1000000000, -0.0000000001, 1e19},
                {0.0001, 20, 5e-6},
                {-0.0001, -20, 5e-6},
                {-0.0001, 20, -5e-6},
                {0.0001, 0.20, 0.0005},
                {0.0001, -0.20, -0.0005},
                {-0.0001, -0.20, 0.0005},
        };
    }
    @Test(dependsOnMethods = "test_1", groups = "division", dataProvider = "Test_Division")
    public void Test_2(double a, double b, double c) throws NoSuchMethodException {
        SoftAssert softAssert = new SoftAssert();
        double division_result = Main.division(a, b);
        Assert.assertEquals(division_result, c);
        System.out.println("Число a = " + a + ", Число b = " + b);
        System.out.println("excepted_Division_result = " + c);
        System.out.println("actual_Division_result = " + division_result);
    }

    @DataProvider(name = "Test_Sum")
    public static Object[][] sum_Numbers() {
        return new Object[][] {
                {-25, 0, -25},
                {0, -1000, -1000},
                {0, 3, 3},
                {15, 0, 15},
                {0, 0, 0},
                {-15, -10, -25},
                {12, 17, 29},
        };
    }
    @Test(groups = "sum", dataProvider = "Test_Sum")
    public void Test_3(int a, int b, int c) {
        SoftAssert softAssert = new SoftAssert();
        int sum_result = Main.sum(a, b);
        Assert.assertEquals(sum_result, c);
        System.out.println("Число a = " + a + ", Число b = " + b);
        System.out.println("excepted_Sum_result = " + c);
        System.out.println("actual_Sum_result = " + sum_result);
    }

    @DataProvider(name = "Test_Replacement")
    public static Object[][] replacement_Chars() {
        return new Object[][] {
                {" " , " "},
                {"a", "b"},
                {" a", " b"},
                {"a ", "b "},
                {"a_", "b_"},
                {"__a", "__b"},
                {"a7107%-aa", "b7107%-bb"},
                {"% a !", "% b !"},
                {"aaAA" , "bbAA"},
                {"GdD" , "GdD"},
        };
    }
    @Test(groups = "replacement", dataProvider = "Test_Replacement")
    public void Test_4(String a, String b) {
        SoftAssert softAssert = new SoftAssert();
        String replacement_result = Main.replacement(a);
        softAssert.assertEquals(replacement_result, b);
        softAssert.assertEquals(replacement_result, b);
        softAssert.assertNotNull(b);
        System.out.println("String before replacement =" + a);
        System.out.println("excepted_Replacement_result =" + b);
        System.out.println("actual_Replacement_result =" + replacement_result);
        softAssert.assertAll();
    }

    @AfterMethod
    void afterMethod() {
        System.out.println("after method");
    }

    @AfterTest
    void afterTest () {
        System.out.println("After test");
    }

    @AfterClass
    void afterClass () {
        System.out.println("after class First test");
    }

    @AfterSuite
    void afterSuite() {
        System.out.println("After suite");
    }
}
