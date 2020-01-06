package net.csdcodes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * creator: deliasu
 * site: https://csdcodes.net
 * date: 06/01/20
 */
@Controller
public class WelcomeController {

    @GetMapping("/welcome")
    private String welcome(){
        return "welcome";
    }
}
