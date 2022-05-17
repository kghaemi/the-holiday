package kg.vacay.houseswap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccommodationController {
    @GetMapping("/User/katieghaemi/Documents") //this means the server will start on the localhost
    public String helloWorld() {
        String hw = "<h1> hello world!!!!!! <h1/>";
        return hw;
    }

}
