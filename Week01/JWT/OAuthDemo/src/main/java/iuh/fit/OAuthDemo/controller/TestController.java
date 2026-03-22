package iuh.fit.OAuthDemo.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {
    @GetMapping("/public/hello")
    public String publicHello() {
        return "Hello Public";
    }

    @GetMapping("/secure/hello")
    public String secureHello(Authentication auth) {
        return "Hello " + auth.getName();
    }
}
