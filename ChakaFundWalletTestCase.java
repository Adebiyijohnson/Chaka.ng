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
    driver.get("https://chaka.ng/dashboard/portfolio");
    driver.findElement(By.xpath("//header[@id='header']/nav/div/ul/li[3]/a/span")).click();
    driver.findElement(By.xpath("//div[@id='app']/main/section/section/div/section[2]/div/div/div/div[2]/button")).click();
    driver.findElement(By.xpath("//div[@id='app']/div[2]/div/div[2]/div/div[2]/div/button[2]")).click();
    driver.findElement(By.xpath("//input[@type='text']")).click();
    driver.findElement(By.xpath("//input[@type='text']")).clear();
    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("1000");
    driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
    driver.findElement(By.xpath("//div[@id='app']/div[2]/div/div[2]/div/div[3]/div[2]/div[2]/button[2]")).click();
    driver.findElement(By.xpath("//div[@id='app']/div[2]/div/div[2]/div/div[3]/div[2]/div[2]/div")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [doubleClick | //div[@id='app']/div[2]/div/div[2]/div/div[3]/div[2]/div[2]/div | ]]
    driver.findElement(By.cssSelector("a.modal-header__close > svg")).click();
    driver.findElement(By.xpath("//header[@id='header']/nav/ul/li/span/span/span")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [selectFrame | index=2 | ]]
    driver.findElement(By.cssSelector("#helpcrunch-popup-close-button > svg")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [selectFrame | relative=parent | ]]
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
