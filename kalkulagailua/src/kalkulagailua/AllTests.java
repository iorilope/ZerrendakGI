/**
 * 
 */
package kalkulagailua;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

/**
 * 
 * @author Ioritz Lopetegi
 */
@Suite
@SelectClasses({ KalkulagailuaExceptionTest.class, KalkulagailuaparametrizedTest.class, KalkulagailuaTest.class })
public class AllTests {

}
