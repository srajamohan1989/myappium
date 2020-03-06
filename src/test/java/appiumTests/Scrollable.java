package appiumTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Scrollable extends LaunchDeviceAndApp{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	AndroidDriver<AndroidElement> driver = launchApp();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//android.widget.TextView[@text='Views']")).click();
	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));").click();
	
	}
}
