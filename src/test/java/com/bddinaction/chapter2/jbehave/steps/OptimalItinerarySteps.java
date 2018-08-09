package com.bddinaction.chapter2.jbehave.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Pending;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.joda.time.LocalTime;

import java.util.List;

public class OptimalItinerarySteps {
    @Given("$line trains from $lineStart leaves $departure for $destination at $departureTimes")
    @Pending
    public void givenArrivingTrains(String line, String lineStart, String departure, String destination, List<LocalTime> departureTime) {

    }

    @When("I want to travel from $departure to $destination at $time")
    @Pending
    public void whenIWantToTravel(String departure, String destination, LocalTime time) {

    }

    @Then("I should be told about the trains at: $expectedTrainTimes")
    @Pending
    public void shouldBeInformedAbout(List<LocalTime> expectedTrainTimes) {

    }
}
