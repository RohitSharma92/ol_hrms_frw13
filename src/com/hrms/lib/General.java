package com.hrms.lib;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;



public class General extends Global {
	public void openapplication(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell1\\Desktop\\Selenium Testing\\Driver\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to(url); }
 Reporter.log("Application Opened");
 Log.info("Application Opened");
		public void closebrowser(){
		driver.quit();
		}
		public void login() throws Exception{
		driver.findElement(By.name(txt_loginname)).sendKeys(un);
		driver.findElement(By.name(txt_password)).sendKeys(pw);
		driver.findElement(By.name(btn_login)).click();
		Thread.sleep(3000);
		}
//		public void logout(){
//			driver.findElement(By.name(btn_welcome)).click();
//		driver.findElement(By.xpath(xpath_Logout)).click(); }
//		public void addemp(){
//		System.out.println("adding new emp"); }
//		public void delmp(){
//		System.out.println("delete emp"); }
//	

}
