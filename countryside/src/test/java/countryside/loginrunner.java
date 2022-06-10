package countryside;
import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\FAIZANAS\\Desktop\\CommonFloor\\countryside\\src\\test\\resources\\fetaures\\login.feature",glue= {"countryside"},
monochrome = true)
public class loginrunner {

}
