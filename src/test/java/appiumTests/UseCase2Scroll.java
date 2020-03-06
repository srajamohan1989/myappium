package appiumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Wait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class UseCase2Scroll extends LaunchDeviceAndApp{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
    AndroidDriver<AndroidElement> driver = launchApp();
    
    AndroidElement views = driver.findElement(By.xpath("//android.widget.TextView[@text='Views']"));
    views.click();
    AndroidElement ExpandableList = driver.findElement(By.xpath("//android.widget.TextView[@text='Expandable Lists']"));
    ExpandableList.click();
    AndroidElement SimpleAdapter = driver.findElement(By.xpath("//android.widget.TextView[@text='3. Simple Adapter']"));
    SimpleAdapter.click();
    driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Group 11\"));").click();
    //driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));").click();
    driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Child 10\"));").click();
    System.out.println("Git test");
	}

}
