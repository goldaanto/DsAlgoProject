package hook;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import stepdef.LoginPageStep;

public class HookPages {
	
	public static WebDriver driver = null;
	
	
	
	
	@Before("@login")
	public void setDriver()
	{
		
		driver = new ChromeDriver();
		
		
	}
	
	public static  WebDriver getDriver()
	{
		return driver;
	}
	
	
}
