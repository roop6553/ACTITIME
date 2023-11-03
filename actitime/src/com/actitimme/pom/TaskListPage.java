package com.actitimme.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
	@FindBy(xpath = "//div[text()='Add New'])")
	private WebElement addnewBtn;
	
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement newCustomerOption;
	
	@FindBy(xpath=" //input[@placeholder='Enter Customer Name' and @class]")
	private WebElement enterCustNameTbx;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement enterCustDescriptionTbx;
	
	@FindBy(xpath="//div[text()='- Select Customer -' and @class='emptySelection']")
	private WebElement selectCustomerDD;
	
	@FindBy(xpath="//div[text()='Big Bang Company' and @class='itemRow cpItemRow ']")
	private WebElement bigBangCompanyTx;
	
	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement createCustomerBtn;
	
	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[@class='title']")
	private WebElement actualCustomer;
	
	public TaskListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getAddNewBtn() {
		return addnewBtn;
	}
	public WebElement getNewCustomerOption() {
		return newCustomerOption;
	}
	public WebElement getEnterCustNameTbx() {
		return enterCustNameTbx;
	}
	public WebElement getEnterCustDescriptionTbx() {
		return enterCustDescriptionTbx;
	}
	public WebElement getSelectCustomerDD() {
		return selectCustomerDD;
	}
	public WebElement getBigBangCompanyTx() {
		return bigBangCompanyTx;
	}
	public WebElement getCreateCustomerBtn() {
		return createCustomerBtn;
	}
	public WebElement getActualCustomer() {
		return actualCustomer;
	}
	
	@FindBy(xpath = "//div[text()='Add New'])")
	private WebElement addnewBtn2;
	
	@FindBy(xpath="//div[text()='+ New Project']")
	private WebElement newProjectOption;
	
	@FindBy(xpath="//input[@placeholder='Enter Project Name' and @class='projectNameField inputFieldWithPlaceholder inputNameField']")
	private WebElement enterCustNameTbx2;
	
	@FindBy(xpath="//div[@class='comboboxButton']")
	private WebElement scrollBtn;
	
	@FindBy(xpath="//div[@class='comboboxButton']")
	private WebElement scrollButton;
	
	
	

}
