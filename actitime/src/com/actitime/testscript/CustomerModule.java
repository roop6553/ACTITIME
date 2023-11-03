package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitimme.pom.EnterTimeTrackPage;
import com.actitimme.pom.TaskListPage;



@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CustomerModule extends BaseClass {
	private static final String CreateCustomer = null;

	@Test
	public void createCustomer() throws InterruptedException, EncryptedDocumentException, IOException {
		FileLib fil=new FileLib();
		String customerName =fil.getExcelData(CreateCustomer, 1, 2);
	String customerDesc=fil.getExcelData(CreateCustomer, 1, 3);
		EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
e.setTasksTab();
TaskListPage t=new TaskListPage(driver);
t.getAddNewBtn().click();
t.getNewCustomerOption().click();
t.getEnterCustNameTbx().sendKeys(customerName);
t.getEnterCustDescriptionTbx().sendKeys(customerDesc);
t.getSelectCustomerDD().click();
t.getBigBangCompanyTx().click();
t.getCreateCustomerBtn().click();
Thread.sleep(5000);
String actualCustomerText = t.getActualCustomer().getText();
Assert.assertEquals(customerName, actualCustomerText);
}

	
	

}
