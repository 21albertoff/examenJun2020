package org.ual.hmis.TeamADA;

// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class TestQuitarTacharTareaTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
	  System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
	  FirefoxOptions firefoxOptions = new FirefoxOptions();
	  firefoxOptions.setHeadless(true);
	  driver = new FirefoxDriver();
	  js = (JavascriptExecutor) driver;
	  vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void testQuitarTacharTarea() {
	  try {
		  driver.get("http://35.227.5.151:8080/");
		  Thread.sleep(1000);
		  driver.findElement(By.cssSelector(".form-control")).click();
		  Thread.sleep(1000);
		    driver.findElement(By.cssSelector(".form-control")).sendKeys("TareaNoTachada");
		    Thread.sleep(1000);
		    driver.findElement(By.cssSelector(".btn")).click();
		    Thread.sleep(1000);
		    driver.findElement(By.cssSelector(".toggles")).click();
		    Thread.sleep(1000);
		    driver.findElement(By.cssSelector(".far")).click();
		    Thread.sleep(1000);
		    driver.findElement(By.cssSelector(".name")).click();
		    Thread.sleep(1000);
		    assertThat(driver.findElement(By.cssSelector(".name")).getText(), is("TareaNoTachada"));
		    Thread.sleep(1000);
		    driver.findElement(By.cssSelector(".remove > .btn")).click();
	      } catch (InterruptedException e) {
	        e.printStackTrace();
	      }
  }
}
