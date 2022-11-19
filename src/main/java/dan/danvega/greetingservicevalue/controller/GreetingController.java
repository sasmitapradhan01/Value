package dan.danvega.greetingservicevalue.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @Value("${greeting.salutation: Hello}")
    private String greetingSalutation;

    @Value("${welcome.greeting}")
    private String welcomeGreeting;

    @GetMapping
    public String home() {
        return welcomeGreeting + ", World!";
    }
}
