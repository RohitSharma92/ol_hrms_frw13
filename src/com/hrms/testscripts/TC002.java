package com.hrms.testscripts;

import org.testng.annotations.Test;
import com.hrms.lib.General;

public class TC002 {
	@Test
	public void tc002() {
	General g = new General();
	 //test case steps
	g.openapplication();
	g.login();
//	g.addemp();
//	g.delmp();
//	g.logout();
	g.closebrowser();
	}
}


