package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashBoard {
	public static WebElement element;
	public static WebDriver driver = Prerequisite.driver;

	public static WebElement educationButton(WebDriver driver) {
		String xPath = "//a[@href='/ALM/Education']";
		element = driver.findElement(By.xpath(xPath));
		return element;

	}

	public static WebElement master(WebDriver driver) {
		String xPath = "//span[text()='Master']";
		element = driver.findElement(By.xpath(xPath));
		return element;

	}

	public static void goesToEducationPage() {
		DashBoard.master(driver).click();
		DashBoard.educationButton(driver).click();
	}

}
