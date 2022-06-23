package com.crrm.Contact;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.crm.comcast.ObjectRepository.CreateNewDocumentPage;
import com.crm.comcast.ObjectRepository.DocumentPage;
import com.crm.comcast.ObjectRepository.HomePage;
import com.crm.comcast.genericUtilities.BaseClass;
import com.crm.comcast.genericUtilities.BaseClass1;

public class CreateDocumentTest extends BaseClass1
{
@Test
	public void CreateDocumentTest1() throws EncryptedDocumentException, IOException
	{
		
		HomePage hp=new HomePage(driver);	
		hp.getDoclnk().click();
		
		DocumentPage doc=new DocumentPage(driver);
		doc.getCreateDocumentLkup().click();
		
		CreateNewDocumentPage cnd=new CreateNewDocumentPage(driver);
		String title = ELib.readExcelData("Projects", 1, 4);
		cnd.getTitlename().sendKeys(title);
		cnd.getSavebtn().click();
				
		
		
		
	
//		CreateNewProductPage cnp= new CreateNewProductPage(driver);
//		String proname = e.readExcelData("Projects", 2, 0)+ranNumber;
//		cnp.getProName().sendKeys(proname);	
//		
//		cnp.getSavebtn().click();	
				
	}
	
}
