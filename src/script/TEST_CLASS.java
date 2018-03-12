package script;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TEST_CLASS {
	@Test
	public void testA(){
		Reporter.log("Test A....",true);
	}
	@Test
	public void testB(){
		Reporter.log("Test B...",true);
		Assert.fail();
	}
	@AfterMethod
	public void end(ITestResult test){
		String name=test.getName();
		int status=test.getStatus();
		if(status==1){
			Reporter.log(name+" is PASSED", true);
		}
		else{
			Reporter.log(name+" is FAILED", true);
		}
	}
}
