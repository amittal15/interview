package com.ubs.opsit.interviews;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Test;

import static com.ubs.opsit.interviews.support.BehaviouralTestEmbedder.aBehaviouralTestRunner;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Acceptance test class that uses the JBehave (Gerkin) syntax for writing stories.  You should not need to
 * edit this class to complete the exercise, this is your definition of done.
 */
public class BerlinClockFixture {

    private TimeConverter berlinClock;
    private TimeUnit timeUnit;
    private String theTime;
    private int theHour;
    private int theMinute;
    private int theSecond;
    

    @Test
    public void berlinClockAcceptanceTests() throws Exception {
        aBehaviouralTestRunner()
                .usingStepsFrom(this)
                .withStory("berlin-clock.story")
                .run();
    }

    @When("the time is $")
    public void whenTheTimeIs(String time) {
        theTime = time;
        theHour = Integer.parseInt(time.split(":")[0]);
        theMinute = Integer.parseInt(time.split(":")[1]);
        theSecond = Integer.parseInt(time.split(":")[2]);
    }

    @Then("the clock should look like $")
    public void thenTheClockShouldLookLike(String theExpectedBerlinClockOutput) {
        assertThat(berlinClock.convertTime(theTime)).isEqualTo(theExpectedBerlinClockOutput);
    }
    @Then("the hour clock should look like $")
    public void thenTheHourClockShouldLookLike(String theExpectedBerlinHourClockOutput) {
        assertThat(timeUnit.getLamps(theHour)).isEqualTo(theExpectedBerlinHourClockOutput);
    }
    @Then("the minute clock should look like $")
    public void thenTheMinuteClockShouldLookLike(String theExpectedBerlinMinuteClockOutput) {
        assertThat(timeUnit.getLamps(theMinute)).isEqualTo(theExpectedBerlinMinuteClockOutput);
    }
    @Then("the second clock should look like $")
    public void thenTheSecondClockShouldLookLike(String theExpectedBerlinSecondClockOutput) {
        assertThat(timeUnit.getLamps(theSecond)).isEqualTo(theExpectedBerlinSecondClockOutput);
    }
}
