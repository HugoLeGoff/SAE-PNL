package test;
import data.*;
public class TestAccTest {
    public static void main(String[] args){
        AccTest test = new AccTest("test", "testmdp"));
        boolean testLog = test.testMDP("test", "testmdp");
        System.out.println(testLog);
    
    }
}
