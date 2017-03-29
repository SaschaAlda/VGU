package org.vgu.se.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ComputerTest.class, MyTest.class, org.vgu.se.invoice.TestInvoice.class })
public class AllTests {
	
	// Remains empty!!

}
