package kg.vacay.houseswap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccommodationController {
    private static final String template = "Hello, %s!";
    @GetMapping("/accommodation")
    public Accommodation accommodation(@RequestParam(value = "name", defaultValue = "world") String name) {
        return new Accommodation(counter.incrementAndGet(), String.format(template, name));
    }

}
