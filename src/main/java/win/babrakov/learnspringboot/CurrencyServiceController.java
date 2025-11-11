package win.babrakov.learnspringboot;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CurrencyServiceController {

    private final CurrencyServiceConfiguration currencyServiceConfiguration;

    @RequestMapping("/currency-configuration")
    public CurrencyServiceConfiguration retrieveAllCourses() {
        return currencyServiceConfiguration;
    }

}
