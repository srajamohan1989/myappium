package appiumTests;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ElementIdentificationTechniques extends LaunchDeviceAndApp{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = launchApp();
		
		//Element Identification Using XPATH
		driver.findElement(By.xpath("//android.widget.TextView[@text='Preference']")).click();
		
		//Element Identification Using XPATH with MULTIPLE ATTRIBUTES
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='android:id/text1'][@index='2']")).click();
		
		//Element Identification using CLASS NAME
		driver.findElement(By.className("android.widget.CheckBox")).click();
		
		//Element Identification using multiple SAME CLASS NAMES
		driver.findElementsByClassName("android.widget.TextView").get(3).click();
		
		//Element Identification using ID
		driver.findElement(By.id("android:id/edit")).sendKeys("Hello");
		
		//Element Identification using ANDROIDUIAUTOMATOR
		//Syntax: driver.findElementByAndroidUIAutomator("attribute(\"value\")")
		driver.findElementByAndroidUIAutomator("text(\"OK\")").click();
	}
}
