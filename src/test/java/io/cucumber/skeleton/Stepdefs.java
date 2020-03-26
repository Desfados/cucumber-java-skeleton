package io.cucumber.skeleton;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;


public class Stepdefs {
    Person lucy = new Person();
    Person sean = new Person();
    private String messageFromSean;

    @Given("^Lucy is (\\d+)m from Sean$")
    public void lucy_is_350m_from_Sean(int distance) {
    // Write code here that turns the phrase above into concrete actions

        lucy.setLocation(distance);
        sean.setLocation(0);
    }

    @When("^Sean shouts \"(.*?)\"$")
    public void sean_shouts(String message) {
        // Write code here that turns the phrase above into concrete actions
        sean.shout(message);
        messageFromSean = message;
    }

    @Then("^Lucy should hear Sean's message$")
    public void lucy_should_hear_Sean_s_message() {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(asList(messageFromSean), lucy.getMessagesHeard());
    }
}
