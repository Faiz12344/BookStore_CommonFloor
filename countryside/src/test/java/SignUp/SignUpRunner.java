package SignUp;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\FAIZANAS\\Desktop\\CommonFloor\\countryside\\src\\test\\resources\\fetaures\\signupcucm.feature",glue= {"SignUp"},

monochrome = true
)
public class SignUpRunner {

}
