package com.crrm.Contact;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.crm.comcast.ObjectRepository.CreateNewProductPage;
import com.crm.comcast.ObjectRepository.HomePage;
import com.crm.comcast.ObjectRepository.ProductPage;
import com.crm.comcast.genericUtilities.BaseClass1;

public class CreateProductTest extends BaseClass1
{
	@Test
	public void CreateProductTest() throws EncryptedDocumentException, IOException
	{
		

		int ranNumber = JLib.getRandomNumber();

		HomePage hp=new HomePage(driver);	
		hp.getProductsLnk().click();
		
		ProductPage pro = new ProductPage(driver);
		pro.getCreateProduct().click();
		
		CreateNewProductPage cnp= new CreateNewProductPage(driver);
		String proname = ELib.readExcelData("Projects", 2, 0)+ranNumber;
		cnp.getProName().sendKeys(proname);
		
		cnp.getSavebtn().click();	
				
	}
}
