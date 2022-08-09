package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Education {
	public static WebElement element;
	public static WebDriver driver = DashBoard.driver;

	public static WebElement ClickOnAddButton(WebDriver driver) {
		String xpath = "//i[@class='all-color fa fa-plus-circle fa-2x']";
		element = driver.findElement(By.xpath(xpath));
		return element;
	}

	public static void addEducationField() {
		Education.ClickOnAddButton(driver).click();
	}

	public static WebElement Verify_user_name_field(WebDriver driver) {
		String xpath = "//input[@class='form-control ThemeGrid_Width12']";
		element = driver.findElement(By.xpath(xpath));
		return element;
	}

	public static void Verify_user_name_field() {
		Education.Verify_user_name_field(driver).sendKeys("Riyaz sayed");
		Education.Verify_user_name_field(driver).clear();
	}

	public static WebElement Verify_user_name_field_with_specialchar(WebDriver driver) {
		String xpath = "//input[@class='form-control ThemeGrid_Width12']";
		element = driver.findElement(By.xpath(xpath));
		return element;
	}

	public static void Verify_user_name_field_with_specialchar() {
		Education.Verify_user_name_field_with_specialchar(driver).sendKeys("MBA");
	}

	public static WebElement SaveButton(WebDriver driver) {
		String xpath = "//button[@class='btn btn-primary ThemeGrid_Margin4First']";
		element = driver.findElement(By.xpath(xpath));
		return element;
	}

	public static void SaveButton() {
		Education.SaveButton(driver).click();
		Education.Verify_user_name_field_with_specialchar(driver).clear();

	}

	public static WebElement Confirmation_pop_up_SaveButton(WebDriver driver) {
		String xpath = "//button[@class='btn btn-primary']/span[text()='Save']";
		element = driver.findElement(By.xpath(xpath));
		return element;
	}

	public static void Confirmation_pop_up_SaveButton() {
		Education.Confirmation_pop_up_SaveButton(driver).click();
	}

	public static WebElement Confirmation_pop_up_CancelButton(WebDriver driver) {
		String xpath = "//button[@class='btn btn-primary']/span[text()='Cancel']";
		element = driver.findElement(By.xpath(xpath));
		return element;
	}

	public static void Confirmation_pop_up_CancelButton() {
		Education.Confirmation_pop_up_SaveButton(driver).click();
	}

	public static WebElement Minus_Button(WebDriver driver) {
		String xpath = "//i[@class='all-color fa fa-minus-circle fa-2x']";
		element = driver.findElement(By.xpath(xpath));
		return element;
	}

	public static void Minus_Button() {
		Education.Minus_Button(driver).click();
	}

//----------------------saving 5 records------------------------------------------------

	public static WebElement Field_1(WebDriver driver) {
		String xpath = "//input[@id='l2-43_0-Input_Title2']";
		element = driver.findElement(By.xpath(xpath));
		return element;
	}

	public static void Field_1() {
		Education.Field_1(driver).sendKeys("B.A");
	}

	public static WebElement Field_2(WebDriver driver) {
		String xpath = "//input[@id='l2-43_1-Input_Title2']";
		element = driver.findElement(By.xpath(xpath));
		return element;
	}

	public static void Field_2() {
		Education.Field_2(driver).sendKeys("B.D.A");
	}

	public static WebElement Field_3(WebDriver driver) {
		String xpath = "//input[@id='l2-43_2-Input_Title2']";
		element = driver.findElement(By.xpath(xpath));
		return element;
	}

	public static void Field_3() {
		Education.Field_3(driver).sendKeys("B.COM");
	}

	public static WebElement Field_4(WebDriver driver) {
		String xpath = "//input[@id='l2-43_3-Input_Title2']";
		element = driver.findElement(By.xpath(xpath));
		return element;
	}

	public static void Field_4() {
		Education.Field_4(driver).sendKeys("C.A");
	}

	public static WebElement Field_5(WebDriver driver) {
		String xpath = "//input[@id='l2-43_4-Input_Title2']";
		element = driver.findElement(By.xpath(xpath));
		return element;
	}

	public static void Field_5() {
		Education.Field_5(driver).sendKeys("B.S.C");
	}

	public static WebElement Cancel(WebDriver driver) {
		String xpath = "//button[@class='btn btn-primary ThemeGrid_MarginGutter']";
		element = driver.findElement(By.xpath(xpath));
		return element;
	}

	public static void CancelAddition() {
		Education.Cancel(driver).click();
		
	}
	public static WebElement Cancel_yes_button(WebDriver driver) {
		String xpath = "//button[@class='btn btn-primary']/span[text()='Yes']";
		element = driver.findElement(By.xpath(xpath));
		return element;
	}

	public static void Cancel_yes_button() {
		Education.Cancel_yes_button(driver).click();
		
	}
	public static WebElement Cancel_No_button(WebDriver driver) {
		String xpath = "//button[@class='btn btn-primary']/span[text()='No']";
		element = driver.findElement(By.xpath(xpath));
		return element;
	}

	public static void Cancel_No_button() {
		Education.Cancel_No_button(driver).click();
		
	}

}
