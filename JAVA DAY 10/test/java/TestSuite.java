import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import testing.CalculatorTest;
import testing.ChangeStringCaseTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        ChangeStringCaseTest.class,
        CalculatorTest.class
})
public class TestSuite {

}
