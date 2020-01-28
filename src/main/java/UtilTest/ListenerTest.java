package UtilTest;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;


public class ListenerTest implements ITestListener
{
    @Override
    public void onStart (ITestContext results){
        System.out.println("Starts test execution "+results.getName());

    }
    @Override
    public void onFinish (ITestContext results){
        System.out.println("Finish test execution "+results.getName());

    }
    @Override
    public void onTestStart(ITestResult results){
        System.out.println("Test Started "+results.getName());
    }
    @Override
    public void onTestSkipped(ITestResult results) {
        System.out.println("Test Started " + results.getName());
    }
    @Override
    public void onTestSuccess(ITestResult results) {
        System.out.println("Test Started " + results.getName());
    }
    @Override
    public void onTestFailure(ITestResult results) {
        System.out.println("Test Started " + results.getName());
    }
    @Override
    public void onTestFailedButWithinSuccessPercentage (ITestResult results) {
        System.out.println("Test Started " + results.getName());
    }
}

