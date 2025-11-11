package dev.tafoya.springtest.run;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RunController {

    @GetMapping("/hello")
    String home(){
        return "<h1>Hello Runnerz<h1>";
    }
}
