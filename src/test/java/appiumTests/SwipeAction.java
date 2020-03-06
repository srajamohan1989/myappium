package appiumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;

import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

import java.util.concurrent.TimeUnit;

public class SwipeAction extends LaunchDeviceAndApp{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	
	AndroidDriver<AndroidElement> driver = launchApp();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//android.widget.TextView[@text='Views']")).click();
	driver.findElement(By.xpath("//android.widget.TextView[@text='Date Widgets']")).click();
	driver.findElement(By.xpath("//android.widget.TextView[@text='2. Inline']")).click();
	driver.findElement(By.xpath("//*[@content-desc='9']")).click();
	//driver.findElementByAndroidUIAutomator("content-desc(\"9\")").click();
	//Swipe Action perform
	//LongPress for 2 sec //Move to another element //Release
	TouchAction action = new TouchAction(driver);
	WebElement first = driver.findElement(By.xpath("//*[@content-desc='15']"));
	WebElement second = driver.findElement(By.xpath("//*[@content-desc='45']"));
	action.longPress(longPressOptions().withElement(element(first)).withDuration(ofSeconds(2))).moveTo(element(second)).release().perform();
	
	}

}
