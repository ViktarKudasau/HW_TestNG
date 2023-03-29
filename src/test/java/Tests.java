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
        softAssert.assertEquals(division_result, c);
        System.out.println("Число a = " + a + " Число b = " + b);
        System.out.println("actual_result_division = " + division_result);
        System.out.println("excepted_result_division = " + c);
        softAssert.assertAll();
    }

/*    @Test(groups = "sum")
    void testOne() throws NoSuchMethodException {
        SoftAssert softAssert = new SoftAssert();
        double division_result = Main.division(5, 2);
        softAssert.assertEquals(division_result, 2.5);
        System.out.println("division = " + division_result);
        softAssert.assertAll();
    }

    @Test(enabled = false)
    void testTwo() throws NoSuchMethodException {
        SoftAssert softAssert = new SoftAssert();
        int summa_result = Main.sum(3, 5);
        double del_result = Main.division(5, 5);
        String replacement_result = Main.replacement("Oklahoma");
        softAssert.assertEquals(summa_result, 8);
        softAssert.assertEquals(del_result, 1.0);
        softAssert.assertEquals(replacement_result, "Oklbhomb");
        System.out.println("Summa = " + summa_result);
        System.out.println("del = " + del_result);
        System.out.println("String after replace " + replacement_result);
        softAssert.assertAll();
    }
*/
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
