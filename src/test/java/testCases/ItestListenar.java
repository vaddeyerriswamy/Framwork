package testCases;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ItestListenar extends SSCapturing implements ITestListener{

	@Override
	public void onTestFailure(ITestResult result) {
		try {
			captureSS(result.getTestName()+".jpg");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
