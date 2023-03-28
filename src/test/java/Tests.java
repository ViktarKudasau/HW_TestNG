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

    @Test(description = "Hello!Hello!Hello!Hello!Hello!Hello!Hello!Hello!")
    void testOne() {

        SoftAssert softAssert = new SoftAssert();
        int summa_result = Main.summa(3, 5);
        double del_result = Main.del(5, 2);
        String replacement_result = Main.replacement("Oklahoma");
        softAssert.assertEquals(summa_result, 8);
        softAssert.assertEquals(del_result, 2.5);
        softAssert.assertEquals(replacement_result, "Oklbhomb");
        System.out.println("Summa = " + summa_result);
        System.out.println("del = " + del_result);
        System.out.println("String after replace " + replacement_result);
        softAssert.assertAll();

    }

    @AfterMethod
    void afterMethod() {
        System.out.println("after method");
    }

   /* @DataProvider(name = "test1")
    public static Object[][] primeNumbers() {
        return new Object[][] {{2, true}, {6, false}, {19, true}, {22, false}, {23, true}};
    }
    @DataProvider(name = "test1")
    public static Object[][] primeNumbers() {
        return new Object[][] { { new Bean("hi I am the bean", 111) } };
    }

    @Test(dataProvider = "test1")
    public void testMethod(Bean myBean) {
        System.out.println(myBean.getVal() + " " + myBean.getI());
    }
}   */

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
