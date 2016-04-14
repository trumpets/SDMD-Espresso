package gr.academic.city.sdmd.espresso;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by trumpets on 4/14/16.
 */
// Runs all unit tests.
@RunWith(Suite.class)
@Suite.SuiteClasses({GreetingActivityTest.class, AdapterActivityTest.class})
public class TestSuite {
}
