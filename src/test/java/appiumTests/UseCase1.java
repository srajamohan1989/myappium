package appiumTests;

import java.awt.Desktop.Action;

import org.aspectj.apache.bcel.classfile.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.touch.TouchActions;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.offset.ElementOption.element;
public class UseCase1 extends LaunchDeviceAndApp{
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	AndroidDriver<AndroidElement>driver = launchApp();
	TouchAction action = new TouchAction(driver);
	String VIEWS = "android:id/text1";
	
	action.tap(tapOptions().withElement(element(driver.findElement(By.xpath("//android.widget.TextView[@text='Views']"))))).perform();
	action.tap(tapOptions().withElement(element(driver.findElement(By.xpath("//android.widget.TextView[@text='Controls']"))))).perform();
	action.tap(tapOptions().withElement(element(driver.findElement(By.xpath("//android.widget.TextView[@text='2. Dark Theme']"))))).perform();
	driver.hideKeyboard();
	AndroidElement CB1 = driver.findElements(By.className("android.widget.CheckBox")).get(0);
	AndroidElement Star = driver.findElements(By.className("android.widget.CheckBox")).get(2);
	AndroidElement RB1 = driver.findElements(By.className("android.widget.RadioButton")).get(0);
	AndroidElement RB2 = driver.findElements(By.className("android.widget.RadioButton")).get(1);
	AndroidElement TB1 = driver.findElements(By.className("android.widget.ToggleButton")).get(0);
	AndroidElement TB2 = driver.findElements(By.className("android.widget.ToggleButton")).get(1);
	AndroidElement dropDown = driver.findElement(By.className("android.widget.Spinner"));
	System.out.println("*****"+driver.findElements(By.className("android.widget.Switch")).size());
	//AndroidElement MonitorSwitch = driver.findElements(By.className("android.widget.Switch")).get(2);
	System.out.println("Is CB1 is checked: "+ CB1.getAttribute("checked"));
	action.tap(tapOptions().withElement(element(CB1))).perform();
	Thread.sleep(2000);
	System.out.println("Is CB1 is checked(2nd): "+ CB1.getAttribute("checked"));
	
	for(int i=0; i<2;i++) {
	String checked =RB1.getAttribute("checked");
	if(checked.equalsIgnoreCase("true")) {
		action.tap(tapOptions().withElement(element(RB2))).perform();
	}else {
		action.tap(tapOptions().withElement(element(RB1))).perform();
	}
	}
	
	action.tap(tapOptions().withElement(element(Star))).perform();
	System.out.println("Text before toggle..."+ TB1.getAttribute("text"));
	action.tap(tapOptions().withElement(element(TB1))).perform();
	System.out.println("Text after toggle..."+ TB1.getAttribute("text"));
	
	action.tap(tapOptions().withElement(element(dropDown))).perform();
	Thread.sleep(2000);
	//action.tap(tapOptions().withElement(element(driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='Uranus']"))))).perform();
	driver.findElementByAndroidUIAutomator("text(\"Uranus\")").click();
	Thread.sleep(2000);
	
	
	}

}
