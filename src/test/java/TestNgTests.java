import org.testng.annotations.*;

public class TestNgTests {
    @Test
    public void firstTest(){
        System.out.println("firstTest");
    }
    @Test
    public void SecondtTest(){
        System.out.println("SecondTest");
    }
    @Test
    public void thirdTest(){
        System.out.println("thirdTest");
    }
    @BeforeMethod
    public void BeforeMethod(){
        System.out.println("BeforeMethod");
    }
    @AfterMethod
    public void AfterMethod(){
        System.out.println("AfterMethod");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("Before Class");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("After Class");
    }
}
