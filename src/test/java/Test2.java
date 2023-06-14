import org.testng.annotations.Test;

public class Test2 {

    @Test(groups = {"positive"}, priority = 1)
    public void firstTest(){
        System.out.println("first test positives");
    }
    @Test(groups = {"negative"}, priority = 2)
    public void SecondTest(){
        System.out.println("SecondTest negative");
    }
    @Test(groups = {"negative"}, priority = 3)
    public void thirdTest(){
        System.out.println("SecondTest negative");
    }

}
