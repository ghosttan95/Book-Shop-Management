package main;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ BillTest.class, CartTest.class, CustomerNameTest.class, ItemTest.class })
public class AllTests {

}
