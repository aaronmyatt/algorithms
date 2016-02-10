package MyStepdefs;

import ch1.Ex1;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.Arrays;

public class MyStepdefs {
    Double[] empty = {};
    Double output;

    @Given("^I have an empty list$")
    public void iHaveAnEmptyList() throws Throwable {
        System.out.println(Arrays.toString(empty));
    }

    @When("^I run execute the MaxIt function$")
    public void i_run_execute_the_MaxIt_function() throws Throwable {
        Ex1 ex = new Ex1();
        output = ex.MaxIt(empty);
    }

    @Then("^I will see an empty list$")
    public void i_will_see_an_empty_list() throws Throwable {
        assert(output == 0);
    }
}
