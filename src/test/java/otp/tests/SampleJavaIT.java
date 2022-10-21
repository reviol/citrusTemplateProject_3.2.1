package otp.tests;

import org.testng.annotations.Test;

import com.consol.citrus.annotations.CitrusTest;
import com.consol.citrus.testng.spring.TestNGCitrusSpringSupport;

import static com.consol.citrus.actions.EchoAction.Builder.echo;

/**
 * This is a sample Java DSL Citrus integration test.
 *
 * @author Citrus
 */

public class SampleJavaIT extends TestNGCitrusSpringSupport {

    @Test
    @CitrusTest
    public void echoToday() {
        variable("now", "citrus:currentDate()");

        run(echo("Today is: ${now}"));
    }

    @Test
    @CitrusTest(name = "SampleJavaTest.sayHello")
    public void sayHello() {
        run(echo("Hello Citrus!"));
    }
}
