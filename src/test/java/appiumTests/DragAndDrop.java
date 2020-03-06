package appiumTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import io.appium.java_client.TouchAction;
import static java.time.Duration.ofSeconds;
import static io.appium.java_client.touch.offset.ElementOption.element;
public class DragAndDrop extends LaunchDeviceAndApp{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	AndroidDriver<AndroidElement> driver = launchApp();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//android.widget.TextView[@text='Views']")).click();
	driver.findElement(By.xpath("//android.widget.TextView[@text='Drag and Drop']")).click();
	
	TouchAction action = new TouchAction(driver);
	WebElement start = driver.findElements(By.className("android.view.View")).get(0);
	WebElement destination = driver.findElements(By.className("android.view.View")).get(2);
	action.longPress(longPressOptions().withElement(element(start)).withDuration(ofSeconds(2)))
	.moveTo(element(destination)).release().perform();
	}

}

