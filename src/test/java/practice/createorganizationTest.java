package practice;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.vtiger.genericUtility.base;
import com.vtiger.objectrepose.createneworganisationpage;
import com.vtiger.objectrepose.homepage;
import com.vtiger.objectrepose.organisationinformationpage;
import com.vtiger.objectrepose.organisationpage;

public class createorganizationTest extends base {
@Test
public void createorg() {
//click on org module
	homepage hp=new homepage(driver);
	hp.clickonorglink();
	//click on orglookupimg
	organisationpage op=new organisationpage(driver);
	op.clickonorglookupimg();
	//give org name and save
	createneworganisationpage cnop= new createneworganisationpage(driver);
	cnop.createneworganisation("TCS"+jutil.getRandomNum());
	//get headertext
	organisationinformationpage oip=new organisationinformationpage(driver);
	String header = oip.getheader();
	//validation
	SoftAssert s=new SoftAssert();
	s.assertTrue(header.contains("TCS"));
	Reporter.log("org is created nd tc is passed");
	s.assertAll();
	
	

}
}
