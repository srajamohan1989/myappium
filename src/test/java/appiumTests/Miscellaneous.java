package appiumTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;

public class Miscellaneous extends LaunchDeviceAndApp{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	AndroidDriver<AndroidElement> driver = launchApp();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	System.out.println(driver.getContext());
	System.out.println(driver.getBatteryInfo());
	System.out.println(driver.getOrientation());
	//driver.findElement(By.xpath("//android.widget.TextView[@text='Views']")).click();
	
	}

}
