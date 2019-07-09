package guru.springframework.controllers;

import guru.springframework.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    @Qualifier("greetingServiceImpl")
    public GreetingService greetingServiceImpl;
    //trick - name of the property is same as service bean name - spring finds it with reflection, but if there is @Primary on any of those beans, it will override this

    public String sayHello() {
        return greetingServiceImpl.sayGreeting();
    }
}
