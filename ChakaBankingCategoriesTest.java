package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class UntitledTestCase {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testUntitledTestCase() throws Exception {
    driver.get("https://chaka.ng/login");
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [selectFrame | index=2 | ]]
    driver.findElement(By.cssSelector("svg > path")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [selectFrame | relative=parent | ]]
    driver.findElement(By.xpath("//header[@id='header']/nav/div/ul/li[2]/a/span")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [doubleClick | //header[@id='header']/nav/div/ul/li[2]/a/span | ]]
    driver.findElement(By.xpath("//div[@id='app']/main/section/section/section[2]/select")).click();
    driver.findElement(By.xpath("//div[@id='app']/main/section/section/section[2]/select")).click();
    new Select(driver.findElement(By.xpath("//div[@id='app']/main/section/section/section[2]/select"))).selectByVisibleText("Countries");
    driver.findElement(By.xpath("//option[@value='COUNTRIES']")).click();
    driver.findElement(By.xpath("//div[@id='app']/main/section/section/section[3]/div/div[10]/div")).click();
    driver.findElement(By.cssSelector("svg.tag__item--close")).click();
    driver.findElement(By.xpath("//div[@id='app']/main/section/section/section[7]/div/div/button[2]")).click();
    driver.findElement(By.xpath("//div[@id='app']/main/section/section/section[6]/div/div[3]/a/section/div")).click();
    driver.findElement(By.xpath("//div[@id='select']/select")).click();
    new Select(driver.findElement(By.xpath("//div[@id='select']/select"))).selectByVisibleText("3 MONTHS");
    driver.findElement(By.xpath("//option[@value='3M']")).click();
    driver.findElement(By.xpath("//div[@id='app']/main/section/section/section[2]/div/div/div/div/section/section/button[2]")).click();
    driver.findElement(By.xpath("//header[@id='header']/nav/ul/li/span/span")).click();
    driver.findElement(By.linkText("Logout")).click();
    driver.findElement(By.name("email")).clear();
    driver.findElement(By.name("email")).sendKeys("Adebiyijohnson164@gmail.com");
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("Jonnexbj0.");
  }

  @AfterClass(alwaysRun = true)
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
