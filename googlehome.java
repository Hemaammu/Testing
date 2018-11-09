package testRunners;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class) 
//@CucumberOptions(format = {"pretty","html:target/Loginresult"},
@CucumberOptions(format = {"pretty","html:target/QCDLoginresult"},

features= {"src/test/resources"})
public class googlehome {

}
