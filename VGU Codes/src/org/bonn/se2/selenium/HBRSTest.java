package org.bonn.se2.selenium;


import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


public class HBRSTest {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer(); 

  @Before
  public void setUp() throws Exception {
	System.setProperty("webdriver.gecko.driver","/Users/saschaalda/Dokumente Local/Software Projects/Libs/geckodriver");
	// driver = new FirefoxDriver();
	
	DesiredCapabilities capabilities=DesiredCapabilities.firefox();
	capabilities.setCapability("marionette", true);
    driver = new FirefoxDriver(capabilities);
	
    baseUrl = "https://www.h-brs.de/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testHBRS() throws Exception {
    driver.get(baseUrl + "/de");
    System.out.println("TITLE:" + driver.getTitle() );
    driver.findElement(By.partialLinkText("Informatik")).click();
    driver.findElement(By.cssSelector("li.first.leaf > a.icon-international-students")).click();
    driver.findElement(By.xpath("//header[@id='ui-accordion-3-header-0']/h3")).click();
    driver.findElement(By.linkText("Weiterlesen")).click();
    driver.findElement(By.linkText("Jana Schiewe")).click();
    assertEquals("Jana Schiewe", driver.findElement(By.xpath("//div/h1")).getText());
    assertEquals("Informatik", driver.findElement(By.cssSelector("li.selected")).getText());
  }
  
  

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}

